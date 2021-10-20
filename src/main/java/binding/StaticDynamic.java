package binding;

class Foo {
    public void print(Foo f) {
        System.out.println("Foo 1");
    }
}

class Larry extends Foo {
    public void print(Foo f) {
        System.out.println("Larry 1");
    }

    public void print(Larry l) {
        System.out.println("Larry 2");
    }
}

class Curly extends Larry {
    public void print(Foo f) {
        System.out.println("Curly 1");
    }

    public void print(Larry l) {
        System.out.println("Curly 2");
    }

    public void print(Curly c) {
        System.out.println("Curly 3");
    }
}

public class StaticDynamic {
    public static void main(String[] args) {
        /*
        variable.method(argument);
        - Статическое связывание происходит здесь - method(argument),
        который можно вызвать у ссылки variable (не у объекта, а именно у ссылки)

        - Динамическое связывание происходит здесь - variable.method
        Мы здесь вызовем метод, который определили на этапе компиляции при статическом связывании,
        но вызовем его (конкретную реализацию метода) у объекта, на который указывает ссылка variable
         */
        Larry larrynewcurley = new Curly();
            /* Сначала статическое связывание - есть три метода print(принимающий Foo)
            Затем динамическое связывание - вызовем у объекта Curley, т.к. на него идет ссылка
            Следовательно - печатаем Curly 1
            */
        larrynewcurley.print(new Foo());

            /* Сначала статическое связывание - у Larry нет метода print(принимающий Curley), но т.к.
            Curley - ближайший наследник Larry, то компилятор на этапе компиляции выберет метод print(Larry l)
            Затем динамическое связывание - вызовем метод print(Larry l),
             т.к. мы это решили еще на стадии статического связывания у объекта Curley, т.к. на него идет ссылка,
            Следовательно - печатаем Curly 2
            */
        larrynewcurley.print(new Curly());

            /* Статическое связывание - на этапе компиляции видим, что у ссылки Larry есть метод print(Larry l).
            Им и воспользуемся.
            Динамическое связывание - вызываем метод print(Larry l) у объекта Curley, т.к. на него идет ссылка
            Следовательно - печатаем Curly 2
            */
        larrynewcurley.print(new Larry());

        Foo foonewlarry = new Larry();
            /* Статическое связывание - на этапе компиляции видим, что у ссылки Foo нет метода print(принимающего Curley).
            Ближайший к Curley наследник - Larry. но и такого метода print(принимающий Larry) у ссылки Foo нету.
            Далее по иерархии идет Foo. метод print(принимающий Foo) есть. Им и будем пользоваться.
            Динамическое связывание - вызываем метод print(Foo f) у объекта Larry, т.к. на него указывает ссылка.
            Следовательно - печатаем Larry 1
            */
        foonewlarry.print(new Curly());

        Foo foonewcurley = new Curly();
            /* Статическое связывание - на этапе компиляции видим, что у ссылки Foo нет метода print(принимающего Curly).
            Ближайший к Curley наследник - Larry. но и такого метода print(принимающий Larry) у ссылки Foo нету.
            Далее по иерархии идет Foo. метод print(принимающий Foo) есть. Им и будем пользоваться.
            Динамическое связывание - вызываем метод print(Foo f) у объекта Curley, т.к. на него указывает ссылка.
            Следовательно - печатаем Curly 1
            */
        foonewcurley.print(new Curly());

            /* Статическое связывание - на этапе компиляции видим, что у ссылки Foo нет метода print(принимающего Curly).
            Ближайший к Curley наследник - Larry. но и такого метода print(принимающий Larry) у ссылки Foo нету.
            Далее по иерархии идет Foo. метод print(принимающий Foo) есть. Им и будем пользоваться.
            Динамическое связывание - вызываем метод print(Foo f) у объекта Curley, т.к. на него указывает ссылка.
            Следовательно - печатаем Curly 1
            */
        foonewcurley.print(new Larry());

        Larry larrynewlarry = new Larry();
            /* Статическое связывание - на этапе компиляции видим, что у ссылки Larry нет метода print(принимающего Curly).
            Ближайший к Curly наследник - Larry. У Larry есть метод print(принимающий Larry)? Да. Им и воспользуемся.
            Динамическое связывание - вызываем метод print(Larry l) у объекта Larry, т.к. на него указывает ссылка.
            Следовательно - печатаем Larry 2
            */
        larrynewlarry.print(new Curly());
    }
}
