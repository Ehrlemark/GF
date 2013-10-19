package org.grammaticalframework.pgf;

public class Expr {
		private Pool pool;
		private PGF  gr;
		private long ref;

		Expr(Pool pool, PGF gr, long ref) {
			this.pool = pool;
			this.gr   = gr;
			this.ref  = ref;
		}

		public String toString() {
			return showExpr(ref);
		}

		public static native Expr readExpr(String s) throws PGFError;

		private static native String showExpr(long ref);
}