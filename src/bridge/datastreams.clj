(ns bridge.datastreams)

(defn add-sink [stream sink]
  "Adds a the given sink (e. g. a Kafka Producer or a text file) to the data stream"
  (.addSink stream sink))

(defn print-stream [stream]
  "Prints the data stream to stdout"
  (.print stream))

(defn write-as-text [stream path-to-file]
  "Writes the data stream to a text file"
  (.writeAsText stream path-to-file))

(defn write-as-csv [stream path-to-file]
  "Writes the data stream to a csv file"
  (.writeAsCsv stream path-to-file))

