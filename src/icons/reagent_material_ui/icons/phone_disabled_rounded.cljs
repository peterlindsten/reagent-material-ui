(ns reagent-material-ui.icons.phone-disabled-rounded
  "Imports @material-ui/icons/PhoneDisabledRounded as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def phone-disabled-rounded (create-svg-icon (e "path" #js {"d" "M14.54 17.37c-2.63 2.08-5.89 3.39-9.45 3.61-1.13.07-2.07-.87-2.07-2v-1.73c-.01-1.01.75-1.86 1.76-1.98l2.54-.29c.61-.07 1.21.14 1.64.57l1.84 1.84c.81-.41 1.59-.9 2.31-1.45L2.1 4.93a.9959.9959 0 010-1.41c.39-.39 1.03-.39 1.42 0L20.49 20.5c.39.39.39 1.02 0 1.41s-1.02.39-1.41 0l-4.54-4.54zm2.85-6.57l-1.85-1.85c-.43-.43-.64-1.03-.57-1.64l.29-2.52c.12-1.01.97-1.77 1.99-1.77h1.73c1.13 0 2.07.94 2 2.07-.22 3.57-1.54 6.83-3.62 9.47l-1.43-1.43c.55-.73 1.04-1.51 1.46-2.33z"})
                                             "PhoneDisabledRounded"))
