package org.kosmocourses.junior.lesson14;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        int a = 0;
        int b = 33;

//        try {
//
//// Генерируем сами ошибку:
//            //throw new RuntimeException("Ерунда!");
//            throw new IllegalArgumentException("Ерунда!");
////            System.out.println("not printed"); // Этот код никогда не выполниться и за это нас поругают
////                                               // так как компилятор может это предсказать,
////                                               // потому что строкой выше всегда возникает ошибка
////// Ошибка при делении на 0:
////            System.out.println(b/a); // Делим на 0 и получаем ArithmeticException
////            System.out.println("not printed"); // Этот код никогда не выполниться, но нас не ругают
////                                               // потому что компилятор не может предсказать из-за
////                                               // использования переменных в операции деления
////// ----
//
//        } catch (ArithmeticException | IllegalArgumentException e){
//            System.out.println("Какая-то ошибка в математике! " + e.getMessage());
//        } finally {
//            System.out.println("finally");
//        }

// В цикле проводим деление и получаем ошибку при делении на 0 на первой итерации цикла:
//        for (int i = 0; i < 100; i++){
//            try {
//                System.out.println(b/i);
//                System.out.println("тра-та-та!");
//            } catch (Exception ex) { // обрабатываем ошибку и переходим к следующей итерации цикла
//                System.out.println(ex.getMessage());
//            }
//        }

// Примерный шаблон конструкции по обработке исключительной ситуации (ошибки):
//
//        try {
//            // код который возможно генерирует ошибку
//        } catch (Exception ex){
//            // код обработки исклюцительной ситуации
//        } finally {
//            // код который выполняется всегда
//        }



        Integer i = null;
        try {
            System.out.println(getString(i));
        } catch (MyException e) {
            System.out.println("пойман:");
            e.printStackTrace();
        }
    }

    /**
     * Хитрая привередливый метод, преоразования числа в строку
     *
     * @param numb число
     * @return  Возвращаем строковое представление числа
     * @throws MyException указываем в сигнатуре метода что мы можем получить ошибку и ее не обрабатываем
     */
    private static String getString(Integer numb) throws MyException {
        if (numb == null){
            try {
                throw new IllegalArgumentException("Incorrect number! Please change it and try again.");
            } catch (RuntimeException ex) {
                throw new MyException("ERROR: ", ex); // сцепляем ошибки, т.е. указываем что ошибка
                        // MyException произошла из-за возникновения ошибки IllegalArgumentException,
                        // которая является подклассом ошибок RuntimeException
            }

        } else {
            if (numb == 13) {
                throw new MyException("Плохое число!"); // генерируем свою ошибку
            }
            return String.valueOf(numb); // получаем строку из числа
        }
    }
}
