public class Quiz {
    public static void main(String[] args) {
        Questao[] quiz = new Questao[15];
        System.out.println("Nome da Faculdade: UNIFAN\n Nome do Aluno: Carlos Eduardo Sousa Costa\n Nome do Professor: Brenno Pimenta\n");
        System.out.println("------------------------------------------------------------------------------------------\n Sejam Bem vindos ao Quiz de 15 perguntas sobre capitais de alguns países!\n------------------------------------------------------------------------------------------");

        // Criando as 15 questões sobre capitais de países
        quiz[0] = new Questao();
        quiz[0].pergunta = "1-Qual é a capital da França?";
        quiz[0].opcaoA = "A) Paris";
        quiz[0].opcaoB = "B) Londres";
        quiz[0].opcaoC = "C) Roma";
        quiz[0].opcaoD = "D) Madri";
        quiz[0].opcaoE = "E) Berlim";
        quiz[0].correta = "A";
        
        quiz[1] = new Questao();
        quiz[1].pergunta = "2-Qual é a capital da Alemanha?";
        quiz[1].opcaoA = "A) Viena";
        quiz[1].opcaoB = "B) Amsterdã";
        quiz[1].opcaoC = "C) Berlim";
        quiz[1].opcaoD = "D) Paris";
        quiz[1].opcaoE = "E) Bruxelas";
        quiz[1].correta = "C";
        
        quiz[2] = new Questao();
        quiz[2].pergunta = "3-Qual é a capital do Japão?";
        quiz[2].opcaoA = "A) Seul";
        quiz[2].opcaoB = "B) Pequim";
        quiz[2].opcaoC = "C) Tóquio";
        quiz[2].opcaoD = "D) Bangkok";
        quiz[2].opcaoE = "E) Hong Kong";
        quiz[2].correta = "C";
        
        quiz[3] = new Questao();
        quiz[3].pergunta = "4-Qual é a capital do Canadá?";
        quiz[3].opcaoA = "A) Montreal";
        quiz[3].opcaoB = "B) Ottawa";
        quiz[3].opcaoC = "C) Toronto";
        quiz[3].opcaoD = "D) Vancouver";
        quiz[3].opcaoE = "E) Calgary";
        quiz[3].correta = "B";

        quiz[4] = new Questao();
        quiz[4].pergunta = "5-Qual é a capital da Rússia?";
        quiz[4].opcaoA = "A) Moscou";
        quiz[4].opcaoB = "B) São Petersburgo";
        quiz[4].opcaoC = "C) Kiev";
        quiz[4].opcaoD = "D) Varsóvia";
        quiz[4].opcaoE = "E) Tbilisi";
        quiz[4].correta = "A";

        quiz[5] = new Questao();
        quiz[5].pergunta = "6-Qual é a capital da Argentina?";
        quiz[5].opcaoA = "A) Santiago";
        quiz[5].opcaoB = "B) Buenos Aires";
        quiz[5].opcaoC = "C) Lima";
        quiz[5].opcaoD = "D) Montevidéu";
        quiz[5].opcaoE = "E) Bogotá";
        quiz[5].correta = "B";

        quiz[6] = new Questao();
        quiz[6].pergunta = "7-Qual é a capital do Brasil?";
        quiz[6].opcaoA = "A) Rio de Janeiro";
        quiz[6].opcaoB = "B) São Paulo";
        quiz[6].opcaoC = "C) Brasília";
        quiz[6].opcaoD = "D) Salvador";
        quiz[6].opcaoE = "E) Porto Alegre";
        quiz[6].correta = "C";

        quiz[7] = new Questao();
        quiz[7].pergunta = "8-Qual é a capital do Egito?";
        quiz[7].opcaoA = "A) Cairo";
        quiz[7].opcaoB = "B) Rabat";
        quiz[7].opcaoC = "C) Damasco";
        quiz[7].opcaoD = "D) Nairobi";
        quiz[7].opcaoE = "E) Algiers";
        quiz[7].correta = "A";

        quiz[8] = new Questao();
        quiz[8].pergunta = "9-Qual é a capital dos Estados Unidos?";
        quiz[8].opcaoA = "A) Los Angeles";
        quiz[8].opcaoB = "B) Nova York";
        quiz[8].opcaoC = "C) Washington, D.C.";
        quiz[8].opcaoD = "D) Chicago";
        quiz[8].opcaoE = "E) Boston";
        quiz[8].correta = "C";

        quiz[9] = new Questao();
        quiz[9].pergunta = "10-Qual é a capital da Itália?";
        quiz[9].opcaoA = "A) Roma";
        quiz[9].opcaoB = "B) Milão";
        quiz[9].opcaoC = "C) Veneza";
        quiz[9].opcaoD = "D) Florença";
        quiz[9].opcaoE = "E) Turim";
        quiz[9].correta = "A";

        quiz[10] = new Questao();
        quiz[10].pergunta = "11-Qual é a capital da Espanha?";
        quiz[10].opcaoA = "A) Madrid";
        quiz[10].opcaoB = "B) Barcelona";
        quiz[10].opcaoC = "C) Valência";
        quiz[10].opcaoD = "D) Sevilha";
        quiz[10].opcaoE = "E) Bilbao";
        quiz[10].correta = "A";

        quiz[11] = new Questao();
        quiz[11].pergunta = "12-Qual é a capital da Índia?";
        quiz[11].opcaoA = "A) Mumbai";
        quiz[11].opcaoB = "B) Calcutá";
        quiz[11].opcaoC = "C) Nova Délhi";
        quiz[11].opcaoD = "D) Bangalore";
        quiz[11].opcaoE = "E) Chennai";
        quiz[11].correta = "C";

        quiz[12] = new Questao();
        quiz[12].pergunta = "13-Qual é a capital da Austrália?";
        quiz[12].opcaoA = "A) Sydney";
        quiz[12].opcaoB = "B) Melbourne";
        quiz[12].opcaoC = "C) Perth";
        quiz[12].opcaoD = "D) Canberra";
        quiz[12].opcaoE = "E) Adelaide";
        quiz[12].correta = "D";

        quiz[13] = new Questao();
        quiz[13].pergunta = "14-Qual é a capital do México?";
        quiz[13].opcaoA = "A) Cancún";
        quiz[13].opcaoB = "B) Cidade do México";
        quiz[13].opcaoC = "C) Monterrey";
        quiz[13].opcaoD = "D) Guadalajara";
        quiz[13].opcaoE = "E) Tijuana";
        quiz[13].correta = "B";

        quiz[14] = new Questao();
        quiz[14].pergunta = "15-Qual é a capital do Chile?";
        quiz[14].opcaoA = "A) Santiago";
        quiz[14].opcaoB = "B) Valparaíso";
        quiz[14].opcaoC = "C) Concepción";
        quiz[14].opcaoD = "D) Antofagasta";
        quiz[14].opcaoE = "E) La Serena";
        quiz[14].correta = "A";

        // Executando o quiz
        int score = 0;
        for (Questao questao : quiz) {
            questao.escrevaQuestao();
            String resposta = questao.leiaResposta();
            if (questao.isCorreta(resposta)) {
                score++;
            }
        }
        System.out.println("Você acertou " + score + " de 15 perguntas!");
        double porcentagemAcertos = ((double) score / 15) * 100;
    System.out.println("Porcentagem de acertos: " + porcentagemAcertos + " de 100%");

   }
}
