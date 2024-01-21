package org.zerock.w1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(name = "myServlet", urlPatterns = "/my")
// @WebServlet 브라우저의 경로와 해당 서블릿을 연결하는 설정을 위해 사용
public class MyServlet extends HttpServlet {

    @Override //doGet은 브라우저의 주소를 직접 변경해서 적근하는 경우에 호출되는 메서드
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws
                                                    ServletException, IOException {
        resp.setContentType("text/html");

        PrintWriter out = resp.getWriter();
        out.println("<html><body>");
        out.println("<h1>MyServlet</h1>");
        out.println("</body></html>");

        /*
        일반적으로 자바 코드에서 System.out.println()을 이용해서 호출했던 것이
        서블릿에서는 PrintWriter 라는 객체를 이용해서 브라우저쪽으로 출력을 처리

        //PrintWriter - 브라우저로 무언가를 출력하기 위한 용도
        * */
    }
}

/*
  어노테이션 (Annotation)
  '주석이나 해석'이라고 할 수 있는데 주로 코드상에 추가적인 정보를
  남겨두기 위해서 사용
  어노테이션은 연극 대본의 지문과 유사하게 특정한 코드에 대해
  추가적인 처리나 설정을 위해서 사용
* */