module.exports = {
    convert: function($, f) {
        f.bindPath($)
        f.addFor($.find('div.first').first(), 'model.cards')
        f.mapRichField($.find('h2').first(), "item.title")
        f.mapRichField($.find('p').first(), "item.text")
    }
}