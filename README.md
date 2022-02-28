# spring MVC 1편

# 02월 03일
## 잘된점
+ 서블릿 동작 흐름에 대한 이해
+ request , response 객체에 데이터가 담기는 방식에 대한 이해


## 배운점
+ [URL을 입력했을때 서블릿이 동작하는 흐름](https://unique-wandflower-4cc.notion.site/02-Hello-Servlet-968a9d211e23456eb3e9efc0990e2b2d)
+ [HTTPServletRequest 객체의 부가적인 기능과 객체를 사용하여 가져올수 있는 정보](https://unique-wandflower-4cc.notion.site/03-HttpServletRequest-5c2eb0a7c39b49b7af07d0e1ba18bf6e)
+ HTTP 요청 메시지 구조


# 02월 04일
## spring
### 잘된점
+ HTTP 요청 메시지를 통해 클라이언트에서 서버로 데이터를 전달하는 방법에 대해 정리

### 배운점
+ [GET - 쿼리파라미터](https://www.notion.so/HTTP-GET-6a605df364c542d98a2b6a499d4f7dc9)
+ [POST - HTML Form](https://www.notion.so/HTTP-POST-HTML-Form-389352c0183d4e6a90edd41b09b74899)
+ [API 메시지 바디 - 텍스트](https://www.notion.so/HTTP-API-b674f41d1bad4262a78a1fc777af72ac)
+ [API 메시지 바디 - JSON](https://www.notion.so/HTTP-API-JSON-42f50363d81b486fa11717ff04634fa8)

# 02월 05일
## spring
### 잘된점
+ HTTP Response 객체를 통해 응답 데이터를 생성하는 방법에 대한 이해 및 정리

### 배운점
+ + [HttpServletResponse 객체 사용하여 HTTP 응답 메시지 작성](https://unique-wandflower-4cc.notion.site/HttpServletResponse-2466239415c94b5f81733c1d9fd683c5)
+ [HTML로 응답하기](https://www.notion.so/HTTP-HTML-99130290316040d6ab0129686942186b)
+ [API JSON으로 응답하기](https://www.notion.so/HTTP-API-JSON-b073e7a61c4a48c580d6b2b9dff431f8)

# 02월 07일
## spring
### 잘된점
+ servlet을 사용하여 회원관리 웹 애플리케이션 만들고 정리
+ jsp를 사용하여 회원관리 웹 애플리케이션 만들고 정리
+ 회원관리를 만들때 Repository에 대한 테스트케이스 작성

### 배운점
+ [회원관리 Repository 테스트 케이스 작성](https://unique-wandflower-4cc.notion.site/b7a0e986f1a4476da028bf250668510c)
+ [servlet을 사용하여 회원관리 만든 과정 정리](https://unique-wandflower-4cc.notion.site/servlet-303763931d8f470e89bd7f94788638b0)
+ 자바 코드로 html을 만드는 것은 유지보수하기 매우 힘들다
+ 템플릿 엔진을 사용하면 html 문서에서 필요한 부분에만 코드를 적용하여 동적인 html을 만들수 있다
+ 템플릿 엔진에는 JSP , Thymeleaf , Freemarker , Velocity등이 있다
+ [jsp를 사용하여 회원관리 만든 과정 정리](https://unique-wandflower-4cc.notion.site/JSP-363ae7db26ec4c8ab69e1282231d0e45)


# 02월 08일
## spring
### 잘된점
+ servlet에 MVC 패턴을 적용하여 회원관리 웹 애플리케이션 개발

### 배운점
+ MVC 패턴으로 분리했을떄 장점
+ Model View Controlle의 역할
+ 포워딩과 리다이렉트 차이
+ JSP에 el태그와 jstl을 사용하여 데이터를 바인딩 시키는 방법
+ [MVC 패턴 정리](https://unique-wandflower-4cc.notion.site/MVC-130e7ece5dc540868c09e4ade94f72e1)


# 02월 20일
## spring - FrontController 패턴
### 잘된점
+ spring 프론트컨트롤러 도입 배경과 특징에 대한 이해
+ 기존 servlet 코드를 프론트컨트롤러 패턴을 사용하여 리펙토링 진행

### 배운점
+ [프론트컨트롤러 도입 배경과 특징](https://unique-wandflower-4cc.notion.site/1cfb6dbf9be84d98bc88b59d852657f3)
+ [servlet을 프론트컨트롤러 패턴을 사용하여 리펙토링](https://unique-wandflower-4cc.notion.site/v1-1739b92d64a842a4a5da19e813331d5e)


# 02월 21일
## spring - FrontController를 사용하여 view 분리
### 잘된점
+ view를 분리해야 하는 이유 와 장점

### 배운점
+ [프론트컨트롤러 패턴을 사용하여 view를 분리하는 과정 정리](https://unique-wandflower-4cc.notion.site/VIEW-aadfcc80c4a340be990aaca455362323)


# 02월 25일
## spring - FrontControllerServlet view 렌더링 코드 분리
### 잘된점
+ FrontControllerServlet에서 view 렌더링 처리
+ 컨트롤러에서는 view 페이지 경로만 생성하여 반환
+ 모델을 사용하여 컨트롤러에서 서블릿 의존성 제거
+ FrontControllerServlet에서 view 포워딩 코드 중복 제거

### 배운점
+ [프론트컨트롤러서블릿 view 렌더링 코드 분리](https://unique-wandflower-4cc.notion.site/VIEW-aadfcc80c4a340be990aaca455362323)
+ [모델을 통한 서블릿 의존성 제거 및 뷰 포워딩 코드 중복 제거](https://unique-wandflower-4cc.notion.site/Model-V3-de6d205739474fb4967ff62b9f73c5b8)


# 02월 26일
## spring
### 잘된점
+ V1 - FrontController HandlerMapping 
     - 컨트롤러에서 뷰 페이지로 포워딩
+ V2 - 컨트롤러는 뷰 경로만 반환
     -  프론트 컨트롤러에서 뷰 페이지로 포워딩
+ V3 - 컨트롤러의 서블릿 종속성 제거
     - 컨트롤러는 ModelView 객체에 뷰 이름과 데이터만 담아 반환
     - 프론트 컨트롤러에서 ViewResolver가 물리적 뷰 경로 생성 
     - request 객체에 ModelView 객체에 들어있는 데이터를 담아 뷰페이지로 포워딩
    
### 배운점
+ [v1 정리내용](https://unique-wandflower-4cc.notion.site/1cfb6dbf9be84d98bc88b59d852657f3)
+ [v2 정리내용](https://unique-wandflower-4cc.notion.site/VIEW-V2-aadfcc80c4a340be990aaca455362323)
+ [v3 정리내용](https://unique-wandflower-4cc.notion.site/Model-V3-de6d205739474fb4967ff62b9f73c5b8)


# 02월 27일
## servlet 부터 spring 프레임워크까지 직접 만들기
### 잘된점
+ V4 - FrontController 에서 ModelView 객체를 만들어 Controller에게 전달한다
     - Controller는 더이상 ModelView 객체를 반환하지 않는다
     - ViewName만 반환한다
  
### 배운점
+ [v4 정리내용](https://unique-wandflower-4cc.notion.site/V4-b67cc0ff03224be898d2ad1fe968a8b6)

# 02월 28일
## FrontController에 핸들러 어댑터 적용
### 잘된저
+ V5_1 
+ + FrontController에 핸들러 어댑터 적용하여 핸들러 어댑터를 통해 컨트롤러가 호출되도록 코드 변경 작업 진행중
  
### 배운점
+[프론트 컨트롤러에 핸들러 어댑터 적용](https://unique-wandflower-4cc.notion.site/1-V5-d24a208d4e3f4ab798e7adcd66134b05)