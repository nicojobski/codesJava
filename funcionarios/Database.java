public class Database {
        private String nome;
        private String sexo;
        private Data datanascimento;
        
        public Database(String nome, String sexo, Data data) {
            if (!sexo.equals("F") && !sexo.equals("f") && !sexo.equals("M") && !sexo.equals("m")) {
                this.sexo = "?"; 
            } else {
                this.sexo = sexo;
            }
            this.nome = nome;
            this.datanascimento = data;
        }

        public String getNome() {
            return nome;
        }

        public String getSexo() {
            return sexo;
        }

        public Data getNascimento() {
            return datanascimento;
        }

        public int calculoIdade() {
            int ano = this.datanascimento.getAno();
            int mes = this.datanascimento.getMes();
            int dia = this.datanascimento.getDia();
            
            int idade;
            
            if (mes < 3 || (mes == 3 && dia < 8)) {
                idade = 2025 - ano;
            } else {
                idade = 2024 - ano;
            }
            
            return idade;  
        }
    }
