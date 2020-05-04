module.exports = {
    convert: function($, f) {
        f.wrap($, 'themecleanflex-components-block');
        f.bindAttribute($.parent(),'model','model');
        f.mapField( $.find('h3'), 'model.title')
    }
}