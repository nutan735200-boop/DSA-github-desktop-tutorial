#include<stdio.h>
int main(){
    int n;
    printf("Enter the number of elements: ");
    scanf("%d",&n);
    int a[n];
    printf("Enter the elements: ");
    for(int i=0;i<n;i++){
        scanf("%d",&a[i]);
    }
    int low=0;
    int mid=0;
    int high=n-1;
    int temp;
    while(mid<=high){
        if(a[mid]==0){
            temp=a[low];
            a[low]=a[mid];
            a[mid]=temp;
            low++;
            mid++;
        }
        else if(a[mid]==1){
            mid++;
        }
        else{
            temp=a[mid];
            a[mid]=a[high];
            a[high]=temp;
            high--;
        }
    }
    printf("Sorted 0s 1s & 2s: ");
    for(int i=0;i<n;i++){
        printf("%d ",a[i]);
    }
    return 0;
}