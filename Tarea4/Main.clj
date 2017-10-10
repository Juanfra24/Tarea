(require '[clojure.string :as str])
(use '[clojure.string :only (replace-first)])

(def altura (atom (rand-int 30)))
(def cont1 (atom 0))
(def linea (atom "                               "))
(println @linea)

;(swap! linea (partial str/join @linea))

;swap! x (partial + 3))


(while(> @altura @cont1)(do
                      
  (swap! cont1 inc)
  (reset! linea (replace-first @linea #" " "#"))
  (println @linea)

 ; (while(> @altura @cont1)(do                   
                      
                      
                      
                      
                      ))
     ; printf("Imprimiendo pirámide de altura %i\n", altura);
    ;for(int i=0; i<altura; i++) {
   ;     for(int j=0; j<altura-i-1; j++) {
     ;       printf(" ");
   ;     }
  ;      for(int j=0; j<i+1; j++) {
   ;         printf("#");
    ;    }
   ;     printf("\n");
;    }
;}