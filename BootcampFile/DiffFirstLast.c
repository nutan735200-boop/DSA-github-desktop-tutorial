#include<stdio.h>
#include<math.h>
int main(){
    int n;
    printf("Enter the size of the array: ");
    scanf("%d",&n);
    int a[n];
    printf("Enter the elements of the array: ");
    for(int i=0;i<n;i++){
        scanf("%d",&a[i]);
    }
    int Diff=0;
    Diff=abs(a[0]-a[n-1]);
    printf("Difference of the first and last element: %d",Diff);
    return 0;
}