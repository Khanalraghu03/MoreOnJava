package Chapter7;

public class SelectionSort {
    public static void main(String[] agrs)
    {
        double selectionSort[] = {7,1,13,2,83,9,13,11};
    }
 /** The method for sorting the numbers */
    public static void selectionSort(double[] list)
    {
        for (int i = 0; i < list.length - 1; i++)
        {
            // Find the minimum in the list[i..list.length-1]
            double currentMin = list[i];
            int currentMinIndex = i;

            for (int j = i + 1; j < list.length; j++)
            {
                if (currentMin > list[j])
                {
                     currentMin = list[j];
                     currentMinIndex = j;
                }
            }

             // Swap list[i] with list[currentMinIndex] if necessary
             if (currentMinIndex != i)
             {
                 list[currentMinIndex] = list[i];
                 list[i] = currentMin;
             }
            //System.out.println(list[i]);
        }
    }
 }
