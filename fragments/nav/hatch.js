module.exports = {
    convert: function($, f) {
        f.wrap($, 'themecleanflex-components-block')
        f.bindAttribute($.parent(),'model','model')
        f.mapRichField($.find('h2').first(), "model.title")
        let menu = $.find('.menu').first()
        f.addFor( menu, "model.nav_item")
        f.mapRichField($.find('p').first(), "item.title")
        f.bindAttribute($.find('a').first(), 'href', 'item.url')
    }
}