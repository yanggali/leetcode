package solutions.utils;

/**
 * 常见的排序算法
 */
public class SortAlgorithms {
    public static void main(String[] args) {
        Integer[] nums = {2,4,1,3,7,5,2};
        mergeSort(nums);
        for(int i = 0 ;i < nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }

    /**
     * 冒泡排序
     * @param a
     * 最好时间：O(n),最坏时间：O(n^2),平均时间：O(n^2),辅助空间O(1)
     */
    public static void bubbleSort(Comparable[] a) {
        int flag;//标记循环是否交换元素
        for (int i = 0; i < a.length - 1; i++) {
            flag = 0;
            for (int j = 0;j < a.length-i-1;j++){
                if(a[j].compareTo(a[j+1])>0){
                    Comparable temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    flag = 1;
                }
            }
            //如果本次没有交换元素，说明数组已经有序
            if(flag == 0){
                return;
            }
        }
    }

    /**
     * 插入排序：1、直接插入
     * @param a
     * 最好时间：O(n),最坏时间：O(n^2),平均时间：O(n^2),辅助空间O(1),稳定
     */
    public static void insertionSort(Comparable[] a){
        for(int i = 1;i < a.length;i++){
            for(int j = i;j>0 && a[j].compareTo(a[j-1]) < 0;j--){
                Comparable temp = a[j];
                a[j] = a[j-1];
                a[j-1] = temp;
            }
        }
    }

    /**
     * 改进策略的插入排序，将待插入元素与已排序元素比较，找到插入点，减少交换元素次数
     * @param a
     * 最好时间：O(n),最坏时间：O(n^2),平均时间：O(n^2),辅助空间O(1),稳定
     */
    public static void insertionSortV2(Comparable[] a){
        int i,j;
        for(i = 1;i < a.length;i++){
            Comparable temp = a[i];
            for(j = i;j>0 && temp.compareTo(a[j-1]) < 0;j--){
                a[j] = a[j-1];
            }
            a[j] = temp;
        }
    }

    /**
     * 选择排序：首先在未排序序列中找到最小元素，存放到排序序列的起始位置，
     * 然后，再从剩余未排序元素中继续寻找最小元素，然后放到已排序序列的末尾。
     * @param a
     * 最好时间：O(n^2),最坏时间：O(n^2),平均时间：O(n^2),辅助空间O(1),不稳定
     */
    public static void selectionSort(Comparable[] a){
        int i,j,len = a.length,min;
        Comparable temp;
        for(i = 0;i < len;i++){
            min = i;
            for(j = i;j < len;j++){
                if(a[j].compareTo(a[min]) < 0){
                    min = j;
                }
            }
            temp = a[i];
            a[i] = a[min];
            a[min] = temp;
        }
    }

    /**
     * 快速排序：
     * 1、从数列中挑出一个元素，称为"基准"（pivot），
     * 2、重新排序数列，所有元素比基准值小的摆放在基准前面，所有元素比基准值大的摆在基准的后面（相同的数可以到任一边）。在这个分区结束之后，该基准就处于数列的中间位置。这个称为分区（partition）操作。
     * 3、递归地（recursive）把小于基准值元素的子数列和大于基准值元素的子数列排序。
     * @param a
     * 最好时间：O(nlog(n)),最坏时间：O(n^2),平均时间：O(nlog(n)),辅助空间O(log(n)),不稳定
     */
    public static void quickSort(Comparable[] a){
        quickSort(a,0,a.length-1);
    }
    public static void quickSort(Comparable[] a,int li,int hi){
        if(li >= hi){
            return;
        }
        int middle = partition(a,li,hi);
        quickSort(a,li,middle-1);
        quickSort(a,middle+1,hi);
    }
    public static int partition(Comparable[] a,int li,int hi){
        Comparable pivot = a[li],temp;
        int low=li,high=hi+1;
        while(true){
            while (a[++low].compareTo(pivot) < 0){
                if(low == hi) break;
            }
            while (a[--high].compareTo(pivot) > 0){
                if(high == li) break;
            }
            if(low >= high) break;
            temp = a[low];
            a[low] = a[high];
            a[high] = temp;
        }
        temp = a[high];
        a[high] = pivot;
        a[li] = temp;
        return high;
    }

    /**
     * 归并排序：将两个已经排序的序列合并成一个序列的操作
     * @param a
     */
    public static void mergeSort(Comparable[] a){
        mergeSort(a,0,a.length-1);
    }
    public static void mergeSort(Comparable[] a,int lo,int hi){
        int mid = (lo+hi)/2;
        if(lo < hi){
            mergeSort(a,lo,mid);
            mergeSort(a,mid+1,hi);
            merge(a,lo,mid,hi);
        }
    }
    public static void merge(Comparable[] a,int lo,int mid,int hi){
        Comparable[] temp = new Comparable[hi-lo+1];
        int i = lo,j = mid+1,k=0;
        while(i <= mid && j <= hi){
            if(a[i].compareTo(a[j]) < 0){
                temp[k++] = a[i++];
            }else{
                temp[k++] = a[j++];
            }
        }
        while(i <= mid){
            temp[k++] = a[i++];
        }
        while(j <= hi){
            temp[k++] = a[j++];
        }
        for(int k2 = 0;k2 < temp.length;k2++){
            a[k2+lo] = temp[k2];
        }
    }

}
