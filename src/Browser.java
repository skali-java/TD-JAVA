public class Browser {
        // -> ecrire l'url dans le barre d'url
        // -> trouver l'adresse correspondant au nom de domaine
        // -> Envoyer la requete

        public void navigate(String url){
            String ip=findIpAddress(url);
            String html=sendHttpRequest(ip);
            System.out.println(html);
        }

        public String sendHttpRequest(String ip){
            return "<html><head></head><body><h1>Welcome</h1></body></html>";
        }


        public String findIpAddress(String url){
            return "127.0.0.1";
        }


    }
