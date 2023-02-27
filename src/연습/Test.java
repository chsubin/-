package 연습;

public class Test {
	public static void main(String[] args) {
		
		String content= "<p><img src=\"/green2209S_20/data/ckeditor/sdetail/230122012333_상세페이지.jpg\" style=\"height:1371px; width:1376px\" /><img src=\"/green2209S_20/data/ckeditor/sdetail/230122011945_박스타이틀.png\" style=\"height:29px; width:250px\" /></p>";
		String originContent = content;
		
		if(content.indexOf("src=\"/") != -1) {
				content="";
				while(originContent.indexOf("src=\"/") != -1) {
					int position = 6;
					if(originContent.indexOf("width:")==-1) break;
					content+= originContent.substring(0,originContent.indexOf("width:"));
					System.out.println("1. "+content);
					originContent= originContent.substring(originContent.indexOf("width:"));
					int width= Integer.parseInt(originContent.substring(originContent.indexOf("width:")+position,originContent.indexOf("px"))); 
					System.out.println("width : "+width );
					if(width>1000) {width=1000;}
					content += originContent.substring(0,originContent.indexOf("width:")+6)+width+"px";
					originContent = originContent.substring(originContent.indexOf("px")+2);
					System.out.println("origin :"+ originContent);
				  System.out.println("2. "+content);
			}
				content+=originContent;
		}
	}
}
