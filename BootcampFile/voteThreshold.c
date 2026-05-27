#include<stdio.h>
int main(){
    int n;
    scanf("%d",&n);
    int arr[50];
    for(int i=0;i<n;i++){
        scanf("%d",&arr[i]);
    }
    int threshold=n/4;
    int freq=0;
    for(int i=0;i<n;i++){
        int count=0;
        for(int k=0;k<n;k++){
            if(arr[i]==arr[k]){
                count++;
            }
        }
        if(count>threshold){
            printf("%d",arr[i]);
            freq=1;
            break;
        }
    }
    if(!freq){
        printf("No element appears more than 1/4 times.");
    }
    return 0;
}