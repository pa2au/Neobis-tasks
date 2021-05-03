# Neobis-tasks
* Ermek Ashirov
* 03.05.2021
___
## Image
![image](https://user-images.githubusercontent.com/54929959/116916576-56a60400-ac6f-11eb-8e2e-c06b53907cf5.png)
___
## Simple code

+public class Main {
+public static void main(String[] args) {
        int [] mas = {11, 3, 14, 16, 7};
        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < mas.length-1; i++) {
                if(mas[i] > mas[i+1]){
                    isSorted = false;
 
                    buf = mas[i];
                    mas[i] = mas[i+1];
                    mas[i+1] = buf;
                }
            }
        }
        System.out.println(Arrays.toString(mas));
    }
}
'''
