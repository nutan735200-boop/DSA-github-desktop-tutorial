#include<stdio.h>
int main(){
    int n;
    printf("Enter the number of elements in the array: ");
    scanf("%d", &n);
    int arr[n];
    printf("Enter the elements of the array: ");
    for(int i=0; i<n; i++){
        scanf("%d", &arr[i]);
    }
    int start=0, maxstart=0, length=1, maxlength=1;
    for(int i=1; i<n; i++){
        if(arr[i]>arr[i-1]){
            length++;
        }
        else{
            start=i;
            length=1;
        }
       if(length>maxlength){
          maxlength=length;
          maxstart=start;
        }
    }
    printf("The longest increasing subarray is: ");
    for(int i=maxstart; i<maxstart+maxlength; i++){
        printf("%d\n ", arr[i]);
    }
    printf("Length of the longest increasing subarray is: %d", maxlength);
    return 0;
}