package by.it.novik.jd01_09;

import by.it.novik.jd01_09.io.InOutImpl;
import by.it.novik.jd01_09.utils.Calculate;
import by.it.novik.jd01_09.utils.InputValidator;
import by.it.novik.jd01_09.utils.PrintValues;

import java.io.IOException;

/**
 * Created by Kate Novik.
 */
public class RunMatLab {
    public static void main(String[] args) throws IOException {
        InOutImpl inout = new InOutImpl();
        Calculate calculate = new Calculate();

        String vec = "{1,2,3}";
        String m = "{{1,2,3},{4,5,6},{7,8,9}}";
        String d = "26.2";

        // Операции со скалярными величинами
        System.out.println("Операции со скаларной величиной");
        inout.output(calculate.calculateExp(d + " + " + d));
        inout.output(calculate.calculateExp(d + " + " + vec));
        inout.output(calculate.calculateExp(d + " + " + m));

        inout.output(calculate.calculateExp(d + " - " + "23.1"));
        inout.output(calculate.calculateExp(d + " - " + vec));
        inout.output(calculate.calculateExp(d + " - " + m));

        inout.output(calculate.calculateExp(d + " * " + "5.9"));
        inout.output(calculate.calculateExp(d + " * " + vec));
        inout.output(calculate.calculateExp(d + " * " + m));

        inout.output(calculate.calculateExp(d + " / " + "8.5"));
        inout.output(calculate.calculateExp(d + " / " + vec));
        inout.output(calculate.calculateExp(d + " / " + m));

        System.out.println("/n Операции с матрицой");
        inout.output(calculate.calculateExp(m + " + " + d));
        inout.output(calculate.calculateExp(m + " + " + vec));
        inout.output(calculate.calculateExp(m + " + " + m));

        inout.output(calculate.calculateExp(m + " - " + "23.1"));
        inout.output(calculate.calculateExp(m + " - " + vec));
        inout.output(calculate.calculateExp(m + " - " + m));

        inout.output(calculate.calculateExp(m + " * " + "5.9"));
        inout.output(calculate.calculateExp(m + " * " + vec));
        inout.output(calculate.calculateExp(m + " * " + m));

        inout.output(calculate.calculateExp(m + " / " + "8.5"));
        inout.output(calculate.calculateExp(m + " / " + vec));
        inout.output(calculate.calculateExp(m + " / " + m));

        System.out.println("/nОперации с вектором");
        inout.output(calculate.calculateExp(vec + " + " + d));
        inout.output(calculate.calculateExp(vec + " + " + vec));
        inout.output(calculate.calculateExp(vec + " + " + m));

        inout.output(calculate.calculateExp(vec + " - " + d));
        inout.output(calculate.calculateExp(vec + " - " + vec));
        inout.output(calculate.calculateExp(vec + " - " + m));

        inout.output(calculate.calculateExp(vec + " * " + d));
        inout.output(calculate.calculateExp(vec + " * " + vec));
        inout.output(calculate.calculateExp(vec + " * " + m));

        inout.output(calculate.calculateExp(vec + " / " + d));
        inout.output(calculate.calculateExp(vec + " / " + vec));
        inout.output(calculate.calculateExp(vec + " / " + m));

        //Операции присваивания
        System.out.println("/nОперации присваивания");
        inout.output(calculate.calculateExp("A = ((5 + 6) * (7 + 8)) + {1,2,3,4,5}"));
        inout.output(calculate.calculateExp("S = {1,2,3,4,5}"));
        inout.output(calculate.calculateExp("R = 2"));
        inout.output(calculate.calculateExp("N = R + 5"));
        inout.output(calculate.calculateExp("K = ((5 + R) * (7 + 8)) + {1,2,3,4,5}"));
        inout.output(calculate.calculateExp("O = [[1,2],[3,4]] * [[1,2],[3,4]]"));
        inout.output(calculate.calculateExp("D = ((5 - 2) / 6) * 5 + {{1,2},{3,4}}"));
        inout.output(calculate.calculateExp("B = ({1,2,3,4,5} + {1,2,3,4,5} - 5) * 2 + (3 - 5 * (3 + 7))"));
        //Выводим названия переменных и их значения в неотсортированном виде
        PrintValues.printVars();
        //Выводим названия переменных и их значения с сортировкой по названию
        PrintValues.sortVars();

//-----------------------------------------------------------------------------------------------
        //Ввод в консоль с валидацией
        boolean in = false;
        String line;
        do {
            line = InputValidator.checkValidation();
            //Создаем объект калькулятор
            Calculate calc = new Calculate();
            //Вычисляем выражение, введенное с консоли
            inout.output(calc.calculateExp(line));
            while (!line.equals("yes") || !line.equals("no")) {
                System.out.println("Повторить ввод (yes/no)?");
                line = inout.input();
                if (line.equals("yes")) {
                    in = true; break;
                } else if (line.equals("no")) {
                    in = false; break;
                } else {
                    System.out.println("Введите yes или no");
                }
            }
        }
        while (in);
        //Выводим названия переменных и их значения в неотсортированном виде
        PrintValues.printVars();
        //Выводим названия переменных и их значения с сортировкой по названию
        PrintValues.sortVars();


    }


}
