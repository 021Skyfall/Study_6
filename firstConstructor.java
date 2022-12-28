public class firstConstructor {
    static class Person {
        private String name;
        private int age;
        private String job;

        Person(String name, int age, String job) {
            this.name = name;
            this.age = age;
            this.job = job;
        } // 생성자(constructor) 단축키 / alt + insert
        // 오버로드 지원 덕분에 된다
    }
    static class College {
        private String major;
        private double gpa;
        private boolean grduate;

        public College(String major, double gpa, boolean grduate) {
            this.major = major;
            this.gpa = gpa;
            this.grduate = grduate;
        } // 생성자(constructor) 단축키 / alt + insert
    }
    public static void main(String[] args) {
        Person A = new Person("James",26,"Constructor");
        Person B = new Person("Lee",32,"Builder");
        Person C = new Person("Wong",29,"gunner");
        Person D = new Person("Queen",53,"Queen");
        Person E = new Person("Loko",36,"officer");

        College A1 = new College("컴퓨터공학",3.7,true);
        College B1 = new College("고고미술사학",3.4,true);
        College C1 = new College("경찰행정학",3.1,false);
        College D1 = new College("제왕학",4.5,true);
        College E1 = new College("스포츠공학",2.1,false);

        if(A1.gpa < 3.5) {
            A1.grduate = false;
        } else if (B1.gpa < 3.5) {
            B1.grduate = false;
        } else if (C1.gpa < 3.5) {
            C1.grduate = false;
        } else if (D1.gpa < 3.5) {
            D1.grduate = false;
        } else if (E1.gpa < 3.5) {
            E1.grduate = false;
        }

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(String.format("이름 : %s / 나이 : %d / 직업 : %s",A.name,A.age,A.job));
        System.out.println(String.format("전공 : %s / 학점 : %.1f / 졸업여부 : %s",A1.major,A1.gpa,A1.grduate));
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(String.format("이름 : %s / 나이 : %d / 직업 : %s",B.name,B.age,B.job));
        System.out.println(String.format("전공 : %s / 학점 : %.1f / 졸업여부 : %s",B1.major,B1.gpa,B1.grduate));
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(String.format("이름 : %s / 나이 : %d / 직업 : %s",C.name,C.age,C.job));
        System.out.println(String.format("전공 : %s / 학점 : %.1f / 졸업여부 : %s",C1.major,C1.gpa,C1.grduate));
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(String.format("이름 : %s / 나이 : %d / 직업 : %s",D.name,D.age,D.job));
        System.out.println(String.format("전공 : %s / 학점 : %.1f / 졸업여부 : %s",D1.major,D1.gpa,D1.grduate));
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(String.format("이름 : %s / 나이 : %d / 직업 : %s",E.name,E.age,E.job));
        System.out.println(String.format("전공 : %s / 학점 : %.1f / 졸업여부 : %s",E1.major,E1.gpa,E1.grduate));
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
        // String.format에 o, x, d 다 넣었는데 double타입 출력이 안되고 에러나네
        // 스택 오버플로우에 String.format("%4.3f" , x); 이거 쓰래서 써봣는데
        // % 뒤에 4가 정수 자리수, .3f가 소수 자리수 로 출력뎀
        // 정수는 4자리, 소수는 3자리까지 출력하라는 걸 유추할 수 있고
        // 근데 이거 자동 출력은 안되고 정해줘야하나봄 ㄷㄷ
        // 아 알았다 f가 더블 포맷 지정자고, 위 예시 처럼 따로 자리수 지정 안해주면
        // 정수는 그대로 출력되는데 소수가 6자리 까지 default로 나옴 ㅋㅋ
    }
}
