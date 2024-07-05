#include <stdio.h>
#include <string.h>

int main (){
    int num_words; 
    char words[100];

    scanf("%d",&num_words);
    for(int i = 0; i < num_words; i++ ){
        scanf("%s", words);
        int len = strlen(words); // strlen(words) -> lenght of word
        if(len > 10 ){
            printf("%c%d%c\n", words[0], len-2, words[len-1]);
        }else{
            printf("%s\n", words);
        }
    }

    return 0; 
}