module.exports = {
    convert: function($, f) {
        f.bindPath($)
        f.addFor($.find('div').first(), 'model.links')
        f.mapField($.find('p'), "item.title")
        f.mapRichField($.find('a').first(), 'href', "item.internallink")
        f.mapRichField($.find('a').first(), 'href', "item.externalurl")
    }
}