package HomeWork9;

public class Stack {
  public   int stck[] = new int[10];
    int tos;

   public Stack() {
        tos = -1;

    }

   void push(int item) {
        if (tos == 9)
            System.out.println("Стек заполнен.");
        else
            stck[++tos] = item;
    }

    int pop(int del) {
        if (tos < 0) {
            System.out.println("Стек не загружен.");
            return 0;
        } else
            return stck[tos--];
    }
}
