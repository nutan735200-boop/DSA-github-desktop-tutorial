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
   int max=a[0];
   for(int i=0;i<n;i++){
     if(a[i]>max){
        max=a[i];
      }
   }
   printf("Largest element in the array: %d",max);
   return 0;
}