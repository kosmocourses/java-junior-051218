package org.kosmocourse.junior.leesson15.nested;

//  Outer class
public class Server {
    // NESTED CLASS:
    //    1) static nested class
    //    2) non-static nested class = inner class
    //
    // INNER CLASS:
    //    1) member inner class
    //    2) local class
    //    3) anonymous class


    // static nested class
    public static enum RequestType{
        GET, PUT, POST, DELETE
    }

    public static class Request {
        private RequestType requestType;
        private String content;
        private User user;

        public RequestType getRequestType() {
            return requestType;
        }

        public void setRequestType(RequestType requestType) {
            this.requestType = requestType;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public User getUser() {
            return user;
        }

        public void setUser(User user) {
            this.user = user;
        }
    }

    // member inner class
    public class User{
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }


    public Request parsingRequest(){

        // local class
        class Validator{
            public boolean valid(String content){
                return !content.contains("JOIN");
            }
        }

        Request request = new Request();
        Validator validator = new Validator();
        String content = "bla-bla!";

        // anonymous class
        new ListenNetwork() {
            @Override
            public String listen(int port) {
                return null;
            }
        };

        request.setRequestType(RequestType.POST);
        request.setUser(new User());
        if (validator.valid(content)){ request.setContent("bla-bla!");}
        return request;
    }

    public void processRequest(Request request){
        // process
    }
}
