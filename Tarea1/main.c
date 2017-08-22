/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   main.c
 * Author: Juan Fra\ 
 *
 * Created on 19 de agosto de 2017, 13:22
 */

#include <stdio.h>
#include "my_strings.h"
int main(void) 
{

   char* str1 = "hola";

   char* str2 = (char*) malloc( 20 * sizeof(char));

   printf("Escribe hola:");

   scanf("%s", str2);

   if (strcmpic(str1, str2) != 0) printf("No escribiste hola, que triste :( \nTe equivocaste primero en la letra %c, intentalo denuevo",strcmpic(str1, str2) );
   else(printf("Bien!"));

}
