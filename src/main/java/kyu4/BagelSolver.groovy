package kyu4

class BagelSolver {
    static Bagel getBagel() {
        Bagel.metaClass.getValue{4}
        new BagelImpl()
    }

    static class Bagel {
        final int getValue() {
            3
        }
    }

    static class BagelImpl extends Bagel implements GroovyInterceptable {
        int purpose() {
            4
        }

        @Override
        def invokeMethod(String name, args) {
            if ('getValue'.equals(name)) {
                def metaMethod = metaClass.getMetaMethod('purpose', args)
                return metaMethod.invoke(this, args);
            }
            else {
                return super.invokeMethod(name, args)
            }
        }
    }
}
