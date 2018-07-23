window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.Bloco = window.blockly.js.blockly.Bloco || {};

/**
 * Bloco
 */
window.blockly.js.blockly.Bloco.Executar = function() {

	var item, edinho;
	edinho = null;
	item = this.cronapi.util.executeJavascriptReturn("cliente.active.fk_equip");
	this.cronapi.screen.notify('success', this.cronapi.object.getProperty(item,
			'nome'));
}
