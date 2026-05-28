#include<stdio.h>
#include<stdlib.h>
int main(){
    int n;
    printf("Enter the number of elements: ");
    scanf("%d",&n);
    int a[n];
    printf("Enter the elements: ");
    for(int i=0;i<n;i++){
        scanf("%d",&a[i]);
    }
    int min=a[0];
    for(int i=0;i<n;i++){
       if(a[i]<min){
         min=a[i];
       }
    }
    printf("Smallest element in the array: %d\n",min);
    printf("Array after deleting the smallest element: ");
    for(int i=0;i<n;i++){
        if(a[i]!=min)
           printf("%d ",a[i]);  
    }
    return 0;
}