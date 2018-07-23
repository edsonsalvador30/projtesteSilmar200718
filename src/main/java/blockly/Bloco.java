package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;

@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Bloco {

	public static final int TIMEOUT = 300;

	/**
	 *
	 * @return Var
	 */
	// Bloco
	public static Var Executar() throws Exception {
		return new Callable<Var>() {

			private Var item = Var.VAR_NULL;

			public Var call() throws Exception {
				item = cronapi.screen.Operations.getValueOfField(Var.valueOf("cliente.active.fk_equip"));
				cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.notify"), Var.valueOf("success"),
						cronapi.conversion.Operations
								.toString(cronapi.object.Operations.getObjectField(item, Var.valueOf("nome"))));
				return Var.VAR_NULL;
			}
		}.call();
	}

}
