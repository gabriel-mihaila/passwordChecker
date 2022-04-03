# passwordChecker
La inceput citesc din consola o parola si pe urma incep validarea acesteia, dupa cum urmeaza:
1. Mai intai aplic un pattern pentru validarea tuturor conditiilor impuse de problema. Daca parola face match pe acest pattern, atunci aceasta nu mai are nevoie de modificari si voi afisa 0.
2. Daca parola nu face match pe intreg pattern-ul impus de problema, voi sparge acel pattern si voi face fiecare conditie in parte (problema functioneaza momentan doar pe parole mai mici sau egale cu 20 de caractere).
3. Verific daca parola are cel putin o litera mica. Daca nu are, atucni va trebui sa aplic o insertie a unei litere mici (in cazul de fata a literei 'a'). Daca parola avea initial mai putin de 20 de caractere, adaug litera 'a' la finalul parolei, altfel va trebui sa sterg o litera sau o cifra pentru a nu depasi 20 de caractere. Ca sa ma asigur ca nu voi sterge singura litera mare, respectiv singura cifra (caz special), parcurg parola caracter cu caracter pana dau fie de 2 litere mari traversate, fie de 2 cifre. Daca am 2 litere mari traversate, voi alege prima din aceste litere pe care o voi inlocui (am considerat asta ca operatie de stergere) cu litera 'a'.
4. Verific daca parola are cel putin o litera mare. Tratarea acestui caz se face similar cu tratarea cazului de litera mica prezentat mai sus, doar ca vor fi verificate aparitiile de litere mici si cifre. In acest caz, se va aduaga litera mare 'A'.
5. Verific daca parola are cel putin o cifra. Tratarea acestui caz se face similar cu tratarea cazului de litera mica prezentat mai sus, doar ca vor fi verificate aparitiile de litere mici si litere mari. In acest caz, se va aduaga cifra '0'.
6. Verific daca am duplicate. Pe acest caz voi lua un string temp, unde voi stoca din aproape in aproape cate 3 caractere consecutive pe care verific daca sunt egale cu un pattern matching corespunzator. In cazul in care se dovedeste ca temp e format din acelasi caracter, se va sterge prima aparitie a acestuia. Stergerea are loc pana cand nu vor mai exista duplicate, asa cum este expus in problema.
7. La final, ma asigur daca parola mea are minim 6 caractere. Daca nu are, voi gasi prima litera care nu se gaseste in parola si, pana cand parola va ajunge sa aibe minim 6 caractere, voi insera aceasta litera determinata anterior. Pentru a evita o posibila aparitie de duplicate, la inserarea literei, voi alterna intre litara mica si echivalentul in litera mare a acesteia (ma folosesc de paritate pentru alternare).
8. Afisez numarul minim de modificari.
