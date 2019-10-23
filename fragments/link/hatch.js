module.exports = {
    convert: function($, f) {
        f.bindPath($)
        f.mapRichField($.find('p'), "model.title")
        f.mapRichField($.find('a').first(), 'href', "model.link")
    }
}