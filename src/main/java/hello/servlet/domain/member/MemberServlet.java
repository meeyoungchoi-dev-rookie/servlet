package hello.servlet.domain.member;

import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "memberServlet" , urlPatterns = "/member")
public class MemberServlet extends HttpServlet {

    private ObjectMapper objectMapper = new ObjectMapper();

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Member member = new Member();
        member.setUserName("kim");
        member.setAge(20);

        // {"username":"kim", "age": 20}
        String result = objectMapper.writeValueAsString(member);
        response.getWriter().write(result);

    }
}
