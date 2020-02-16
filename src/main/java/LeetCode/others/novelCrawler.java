package LeetCode.others;

import org.jsoup.HttpStatusException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.net.SocketTimeoutException;
import java.util.List;

public class novelCrawler {
    public static void main( String[] args ) throws IOException, InterruptedException {
        /** 针对不同的小说修改属性配置 **********************/
        // 本地存放路径
        String localUrl = "E:\\小说\\";

        // 小说名
        String noverlName = "医妃，天下无双";

        // 章节目录URL
        String chapterUrlList = "https://www.63xs.com/book/72/72799/";

        // 要下载的章节目录
        int chapterStart = 1;
        int chapterEnd = 0;

        // 章节列表所在HTML元素ID或class
        String chaptersId = "list";

        // 文本所在HTML元素ID
        String contextId = "content";

        // 章节需要翻页阅读的时候,翻页按钮的ID
        String linkNext = "";
        /***********************************************/

        // 开始爬取
        Document doc = Jsoup.connect(chapterUrlList).get();
        // 读取章节列表所在元素内所有链接
        Elements chapters = doc.select("div#" + chaptersId).select("a[href]");
//        Elements chapters = doc.select("div#" + chaptersId).get(3).select("a[href]");
        StringBuffer content = new StringBuffer();
        // 小说标题
        content.append(noverlName + "\n");
        // 节选章节（subList方法左开右闭）
        List<Element> subChapters = chapters.subList((chapterStart<=0 ? 0 : chapterStart - 1),
                (chapterEnd<=0 ? chapters.size() : (chapterEnd < chapterStart ? chapterStart : chapterEnd)));

//        int i = 0;

        for (Element chapter : subChapters) {
            // 章目标题
            content.append( "\n\n\n" + chapter.text() + "\n");
            // 暂停进程（毫秒）,防止读取太快
            Thread.sleep(30);
            StringBuffer txtBuf = new StringBuffer();
            String txt = "";
            /**
             * // String txtTrimNbsp = "";
             */
            try{
//                Document section = Jsoup.connect(chapterUrlList + chapter.attr("href")).get();
                Document section = Jsoup.connect("https://www.63xs.com/" + chapter.attr("href")).get();
//                Document section = Jsoup.connect((chapterUrlList + "read_" + ++i + ".html")).get();
                Elements element = section.select("div#" + contextId);
                txtBuf.append(element.text());

                /* 读取本章节的翻页内容 */
                if (linkNext != null && !"".equals(linkNext)) {
                    String nextUrl = section.select("a#" + linkNext).attr("href");
                    Document sectionNext = Jsoup.connect(nextUrl).get();
                    Elements elementNext = sectionNext.select("div#" + contextId);
                    txtBuf.append(elementNext.text());
                }


                /** 替代方法
                 *
                 * // 替换掉网页原文里的【&nbsp;】
                 * // txtTrimNbsp = element.text().replace(Jsoup.parse("&nbsp;").text(), "");
                 *
                 */

                // 除去jsoup解析【&nbsp;】所得到的ASCII值是160的空格
                txt = txtBuf.toString().replace("\u00A0\u00A0\u00A0\u00A0","\n   ");

            } catch (SocketTimeoutException e){
                System.err.println("【" + chapter.text() + "】" + "读入失败！！！   " + e.getMessage());
                continue;
            } catch (HttpStatusException e){
                System.err.println("【" + chapter.text() + "】" + "读入失败！！！--->" + e.getStatusCode());
                break;
            }
            content.append(txt);
            System.out.println("【" + chapter.text() + "】" + "读入成功~");
        }

        // 输出文本文件
        // 1：利用File类找到要操作的对象
        File file = new File(localUrl +noverlName +".txt");
        if(!file.getParentFile().exists()){
            file.getParentFile().mkdirs();
        }

        //2：准备输出流
        Writer out = new FileWriter(file);
        try {
            out.write(content.toString());
        } catch (IOException e){
            System.err.println("往TXT写入失败！！！   ");
        } finally {
            out.close();
        }


    }

}
