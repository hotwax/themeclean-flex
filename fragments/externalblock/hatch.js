module.exports = {
    convert: function($, f) {
        f.wrap($, 'themecleanflex-components-block')
        f.bindAttribute($.parent(),'model','model')
        f.mapField( $.find('h2'), 'model.title')
        f.bindAttribute($.find('a').first(), 'href', 'model.url')
    }
}