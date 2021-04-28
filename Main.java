public class Main {

    public static void main(String[] args) {
        Course courseEffect = new Course();
        Course course1 = new Course("Engin Demiroğ",
                "Programlamaya Giriş İçin Temel Kurs",
                "PYTHON, JAVA, C# gibi tüm programlama dilleri için temel programlama mantığını anlaşılır örneklerle öğrenin..",
                0,
                "TAMAMLANDI");
        Course course2 = new Course("Engin Demiroğ", "Yazılım Geliştirici Yetiştirme Kampı (C# + ANGULAR)", "2 ay sürecek ücretsiz ve profesyonel bir programla, sıfırdan yazılım geliştirme öğreniyoruz.", 0, "TAMAMLANDI");
        Course course3 = new Course("Engin Demiroğ", "Yazılım Geliştirici Yetiştirme Kampı (JAVA + REACT)", "2 ay sürecek ücretsiz ve profesyonel bir programla, sıfırdan yazılım geliştirme öğreniyoruz.", 0, "TAMAMLANDI");

        Course[] courses = {course1, course2, course3};
        for (Course course : courses) {
            System.out.println(course.courseName + " " + course.teacher + " " + course.rate + " " + course.situation);

        }

        CourseManager programs = new CourseManager();
        programs.signIn(course1);
        programs.signIn(course2);
        programs.signIn(course3);

        SignUp signFirst = new SignUp("Emre Atalay", "emreatalay@gmail.com", "abcdef", "abcdef", true, false);
        SignUp signSecond = new SignUp("Bilal Cinviz", "bilal@gmail.com", "12340", "12340", true, false);

        SignUp[] signUps = {signFirst, signSecond};
        for (SignUp sign : signUps) {
            System.out.println("Name Sirname = " + sign.NameAndSirname + " e-Mail Adress = " + sign.eMail + " Password = " + sign.password + " Eğitici ve tanıtım amaçlı e-postalar almayı kabul ediyorum =  " + sign.acceptInfoMail + " Kullanım koşulları & Gizlilik politikası =  " + sign.termsOfUseAndPrivacyPolicy);
        }

        SignUpManager webSite = new SignUpManager();
        webSite.signing(signFirst);
        webSite.signing(signSecond);

    }

}
