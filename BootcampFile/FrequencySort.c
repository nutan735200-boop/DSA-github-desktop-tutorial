#include<stdio.h>
int main(){
    int n;
    scanf("%d",&n);
    int a[n];
    for(int i=0;i<n;i++){
        scanf("%d",&a[i]);
    }
    int freq[100]={0};
    for(int i=0;i<n;i++){
        freq[a[i]]++;
        printf("Frequency of %d: %d\n",a[i],freq[a[i]]);
    }
    for(int i=0;i<n-1;i++){
        for(int j=i+1;j<n;j++){
            if(freq[a[i]]<freq[a[j]]){
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
            else if(freq[a[i]]==freq[a[j]]&& a[i]>a[j]){
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }
    }
    printf("Elements sorted by frequency: ");
    for(int i=0;i<n;i++){
        printf("%d ",a[i]);
    }
    return 0;
}