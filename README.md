# passwordChecker
La inceput citesc din consola o parola si pe urma incep validarea acesteia, dupa cum urmeaza:
1. Mai intai aplic un pattern pentru validarea tuturor conditiilor impuse de problema. Daca parola face match pe acest pattern, atunci aceasta nu mai are nevoie de modificari si voi afisa 0.
2. Daca parola nu face match pe intreg pattern-ul impus de problema, voi sparge acel pattern si voi fiecare conditie in parte (problema functioneaza momentan doar pe parole mai mici sau egale cu 20 de caractere).
3. Verific daca parola are cel putin o litera mica. Daca nu are, atucni va trebui sa aplic o insertie a unei litere mici (in cazul de fata a literei 'a'). Daca parola avea initial mai putin de 20 de caractere, adaug litera 'a' la finalul parolei, altfel va trebui sa sterg o litera sau o cifra pentru a nu depasi 20 de caractere.
