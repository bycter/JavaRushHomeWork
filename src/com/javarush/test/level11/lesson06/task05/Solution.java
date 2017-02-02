package com.javarush.test.level11.lesson06.task05;

/* ИТ-компания
Написать девять классов:
Унаследовать программиста, менеджера проекта и технического директора от ИТ-специалиста.
IT (ИТ-специалист): Programmer(программист), ProjectManager(менеджер проекта), CTO(технический директор),
Унаследовать рекрутера, уборщика и офис-менеджера от клерка.
Clerk (клерк):  HR(рекрутер), OfficeManager(офис-менеджер), Cleaner (уборщик).
Унаследовать клерка и ИТ-специалиста от сотрудника.
Worker(сотрудник): IT (ИТ-специалист), Clerk (клерк)
*/

public class Solution {

    public static void main(String[] args) {

    }

    public class Worker {

    }

    public class Clerk extends Worker {

    }

    public class IT extends Worker {

    }

    public class Programmer extends IT {

    }

    public class ProjectManager extends IT {

    }

    public class CTO extends IT {

    }

    public class OfficeManager extends Clerk {

    }

    public class HR extends Clerk {

    }

    public class Cleaner extends Clerk {

    }
}
