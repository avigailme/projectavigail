package equalsTasks;

    public class Multiple {
        Integer A;
        Integer B;

        public Multiple(Integer A, Integer B) {
            this.A = A;
            this.B = B;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof Multiple) {
                int resultThis = this.A * this.B;
                int resultObj = (((Multiple) obj).A * ((Multiple) obj).B);

                if (resultThis == resultObj) {
                    return true;
                }
            }
            return false;
        }
    }


