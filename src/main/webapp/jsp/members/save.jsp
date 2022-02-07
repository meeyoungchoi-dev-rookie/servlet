<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="hello.servlet.domain.member.Member" %>
<%@ page import="hello.servlet.domain.member.MemberRepository" %>
<%
    MemberRepository memberRepository = MemberRepository.getInstance();
    String username = request.getParameter("username");
    int age = Integer.parseInt(request.getParameter("age"));

    Member member = new Member();
    member.setUserName(username);
    member.setAge(age);

    Member saved = memberRepository.save(member);




%>

<html>
<head>
<title>Title</title>
</head>
<body>

성공
<ul>
    <li>id=>%=member.getId()%></li>
    <li>username=>%=member.getId()%></li>
    <li>age=>%=member.getId()%></li>
</ul>

</body>
</html>