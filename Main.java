package br.univille.logger;
public class Main {
    public static void main(String[] args) {
        LoggerFactory factory = new LoggerFactory();

        Logger consoleLogger = factory.onConsole();
        consoleLogger.log(Level.DEBUG, "Mensagem de depuração");

        Logger fileLogger = factory.onFile();
        fileLogger.log(Level.ERROR, "Erro crítico detectado");
    }
}