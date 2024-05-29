package br.univille.logger;
class LoggerFile implements Logger {
    @Override
    
    public void log(Level level, String message) {
        System.out.println("[" + level + "] (Arquivo) " + message);
    }
}
