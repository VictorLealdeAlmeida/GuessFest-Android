package com.example.victorleal.guessfest.utils

import android.content.Context
import android.util.Xml
import org.xmlpull.v1.XmlPullParser
import org.xmlpull.v1.XmlPullParserException
import java.io.IOException
import java.io.InputStream

// We don't use namespaces
private val ns: String? = null

class StackOverflowXmlParser {

    class StackOverflowXmlParser(val context: Context) {}

    @Throws(XmlPullParserException::class, IOException::class)
    fun parse(inputStream: InputStream): List<*> {
        inputStream.use { inputStream ->
            val parser: XmlPullParser = Xml.newPullParser()
            parser.setFeature(XmlPullParser.FEATURE_PROCESS_NAMESPACES, false)
            parser.setInput(inputStream, null)
            parser.nextTag()
            return mutableListOf(String)
        }
    }

    /*@Throws(XmlPullParserException::class, IOException::class)
    private fun readFeed(parser: XmlPullParser): List<String> {
        val entries = mutableListOf<String>()

        parser.require(XmlPullParser.START_TAG, ns, "feed")
        while (parser.next() != XmlPullParser.END_TAG) {
            if (parser.eventType != XmlPullParser.START_TAG) {
                continue
            }
            // Starts by looking for the entry tag
            if (parser.name == "entry") {
                entries.add(readEntry(parser))
            } else {
                skip(parser)
            }
        }
        return entries
    }*/
}