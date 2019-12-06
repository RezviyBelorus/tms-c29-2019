package tms.c29.test.lec_10;

import java.io.File;

public enum Strategy {

    LOWERCASE {
        public String rename(File file) {
            String name = file.getName();
            String changedName = name.toLowerCase();
            return changedName;
        }
    },
    UPPER_PLUS_LOWER {
        public String rename(File file) {
            String name = file.getName();
            String changedName = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
            return changedName;
        }
    },
    UPPER_CASE {
        public String rename(File file) {
            String name = file.getName();
            String changedName = name.toUpperCase();
            return changedName;
        }
    };

    public abstract String rename(File file);

    public String renameFile(Strategy strategy, File file) {
        return strategy.rename(file);
    }

    public static void main(String[] args) {

    }

    private static void go(Strategy strategy, File file) {
        String s = strategy.renameFile(strategy, file);
    }
}
