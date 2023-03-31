.class public final Lcom/google/android/gms/internal/ads/gs0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/zg1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/ads/zg1<",
        "Lcom/google/android/gms/internal/ads/fs0;",
        "Lcom/google/android/gms/internal/ads/is0;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Ljava/lang/String;

.field private final c:Lcom/google/android/gms/internal/ads/rg;

.field private final d:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/internal/ads/rg;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/gs0;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/gs0;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/gs0;->c:Lcom/google/android/gms/internal/ads/rg;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/gs0;->d:Ljava/lang/String;

    return-void
.end method

.method private final a(Ljava/lang/String;Lcom/google/android/gms/internal/ads/fg;Lorg/json/JSONObject;Ljava/lang/String;)Lcom/google/android/gms/internal/ads/is0;
    .locals 20

    move-object/from16 v1, p0

    const-string v0, "Received error HTTP response code: "

    const-string v2, "doritos_v2"

    const-string v3, "doritos"

    const-string v4, ""

    :try_start_0
    invoke-virtual/range {p2 .. p2}, Lcom/google/android/gms/internal/ads/fg;->a()I

    move-result v5

    const/4 v6, -0x2

    const/4 v7, 0x0

    const/4 v8, 0x1

    if-eq v5, v6, :cond_2

    invoke-virtual/range {p2 .. p2}, Lcom/google/android/gms/internal/ads/fg;->a()I

    move-result v0

    if-ne v0, v8, :cond_1

    invoke-virtual/range {p2 .. p2}, Lcom/google/android/gms/internal/ads/fg;->c()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    const-string v0, ", "

    invoke-virtual/range {p2 .. p2}, Lcom/google/android/gms/internal/ads/fg;->c()Ljava/util/List;

    move-result-object v2

    invoke-static {v0, v2}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/co;->b(Ljava/lang/String;)V

    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/ads/nr0;

    const-string v2, "Error building request URL."

    invoke-virtual/range {p2 .. p2}, Lcom/google/android/gms/internal/ads/fg;->a()I

    move-result v3

    invoke-direct {v0, v2, v3}, Lcom/google/android/gms/internal/ads/nr0;-><init>(Ljava/lang/String;I)V

    throw v0

    :cond_1
    new-instance v0, Lcom/google/android/gms/internal/ads/nr0;

    const-string v2, "Internal error."

    invoke-direct {v0, v2, v7}, Lcom/google/android/gms/internal/ads/nr0;-><init>(Ljava/lang/String;I)V

    throw v0

    :cond_2
    new-instance v5, Lcom/google/android/gms/internal/ads/is0;

    invoke-direct {v5}, Lcom/google/android/gms/internal/ads/is0;-><init>()V

    const-string v6, "SDK version: "

    iget-object v9, v1, Lcom/google/android/gms/internal/ads/gs0;->b:Ljava/lang/String;

    invoke-static {v9}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v10

    if-eqz v10, :cond_3

    invoke-virtual {v6, v9}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    goto :goto_0

    :cond_3
    new-instance v9, Ljava/lang/String;

    invoke-direct {v9, v6}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    move-object v6, v9

    :goto_0
    invoke-static {v6}, Lcom/google/android/gms/internal/ads/co;->c(Ljava/lang/String;)V

    const-string v6, "AdRequestServiceImpl: Sending request: "

    invoke-static/range {p1 .. p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v10

    if-eqz v10, :cond_4

    invoke-virtual {v6, v9}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    goto :goto_1

    :cond_4
    new-instance v9, Ljava/lang/String;

    invoke-direct {v9, v6}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    move-object v6, v9

    :goto_1
    invoke-static {v6}, Lcom/google/android/gms/internal/ads/co;->a(Ljava/lang/String;)V

    new-instance v6, Ljava/net/URL;

    move-object/from16 v9, p1

    invoke-direct {v6, v9}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    new-instance v9, Ljava/util/HashMap;

    invoke-direct {v9}, Ljava/util/HashMap;-><init>()V

    invoke-static {}, Lcom/google/android/gms/ads/internal/q;->j()Lcom/google/android/gms/common/util/d;

    move-result-object v10

    invoke-interface {v10}, Lcom/google/android/gms/common/util/d;->b()J

    move-result-wide v10

    const/4 v12, 0x0

    :goto_2
    iget-object v13, v1, Lcom/google/android/gms/internal/ads/gs0;->c:Lcom/google/android/gms/internal/ads/rg;

    invoke-interface {v13}, Lcom/google/android/gms/internal/ads/rg;->b()V

    invoke-virtual {v6}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v6

    check-cast v6, Ljava/net/HttpURLConnection;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    invoke-static {}, Lcom/google/android/gms/ads/internal/q;->c()Lcom/google/android/gms/internal/ads/gl;

    move-result-object v13

    iget-object v14, v1, Lcom/google/android/gms/internal/ads/gs0;->a:Landroid/content/Context;

    iget-object v15, v1, Lcom/google/android/gms/internal/ads/gs0;->b:Ljava/lang/String;

    invoke-virtual {v13, v14, v15, v7, v6}, Lcom/google/android/gms/internal/ads/gl;->a(Landroid/content/Context;Ljava/lang/String;ZLjava/net/HttpURLConnection;)V

    invoke-static/range {p4 .. p4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v13

    if-nez v13, :cond_5

    const-string v13, "Cookie"

    move-object/from16 v14, p4

    invoke-virtual {v6, v13, v14}, Ljava/net/HttpURLConnection;->addRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_3

    :cond_5
    move-object/from16 v14, p4

    :goto_3
    invoke-virtual/range {p2 .. p2}, Lcom/google/android/gms/internal/ads/fg;->f()Z

    move-result v13

    if-eqz v13, :cond_8

    const-string v13, "pii"

    move-object/from16 v15, p3

    invoke-virtual {v15, v13}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v13

    if-eqz v13, :cond_7

    invoke-virtual {v13, v3, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v16

    invoke-static/range {v16 .. v16}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v16

    if-nez v16, :cond_6

    const-string v7, "x-afma-drt-cookie"

    invoke-virtual {v13, v3, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v6, v7, v8}, Ljava/net/HttpURLConnection;->addRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    :cond_6
    invoke-virtual {v13, v2, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_9

    const-string v7, "x-afma-drt-v2-cookie"

    invoke-virtual {v13, v2, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v6, v7, v8}, Ljava/net/HttpURLConnection;->addRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_4

    :cond_7
    const-string v7, "DSID signal does not exist."

    invoke-static {v7}, Lcom/google/android/gms/internal/ads/wk;->e(Ljava/lang/String;)V

    goto :goto_4

    :cond_8
    move-object/from16 v15, p3

    :cond_9
    :goto_4
    if-eqz p2, :cond_a

    invoke-virtual/range {p2 .. p2}, Lcom/google/android/gms/internal/ads/fg;->e()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v8

    if-nez v8, :cond_a

    const/4 v8, 0x1

    invoke-virtual {v6, v8}, Ljava/net/HttpURLConnection;->setDoOutput(Z)V

    invoke-virtual/range {p2 .. p2}, Lcom/google/android/gms/internal/ads/fg;->e()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/String;->getBytes()[B

    move-result-object v8

    array-length v13, v8

    invoke-virtual {v6, v13}, Ljava/net/HttpURLConnection;->setFixedLengthStreamingMode(I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_4

    :try_start_2
    new-instance v13, Ljava/io/BufferedOutputStream;

    invoke-virtual {v6}, Ljava/net/HttpURLConnection;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v7

    invoke-direct {v13, v7}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :try_start_3
    invoke-virtual {v13, v8}, Ljava/io/BufferedOutputStream;->write([B)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    invoke-static {v13}, Lcom/google/android/gms/common/util/j;->a(Ljava/io/Closeable;)V

    goto :goto_6

    :catchall_0
    move-exception v0

    move-object v7, v13

    goto :goto_5

    :catchall_1
    move-exception v0

    const/4 v7, 0x0

    :goto_5
    invoke-static {v7}, Lcom/google/android/gms/common/util/j;->a(Ljava/io/Closeable;)V

    throw v0

    :cond_a
    const/4 v8, 0x0

    :goto_6
    new-instance v7, Lcom/google/android/gms/internal/ads/wn;

    invoke-direct {v7}, Lcom/google/android/gms/internal/ads/wn;-><init>()V

    invoke-virtual {v7, v6, v8}, Lcom/google/android/gms/internal/ads/wn;->a(Ljava/net/HttpURLConnection;[B)V

    invoke-virtual {v6}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v8

    invoke-virtual {v6}, Ljava/net/HttpURLConnection;->getHeaderFields()Ljava/util/Map;

    move-result-object v13

    invoke-interface {v13}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v13

    invoke-interface {v13}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :goto_7
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v17

    if-eqz v17, :cond_c

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v17

    check-cast v17, Ljava/util/Map$Entry;

    invoke-interface/range {v17 .. v17}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v18

    move-object/from16 v19, v2

    move-object/from16 v2, v18

    check-cast v2, Ljava/lang/String;

    invoke-interface/range {v17 .. v17}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v17

    move-object/from16 v18, v3

    move-object/from16 v3, v17

    check-cast v3, Ljava/util/List;

    invoke-interface {v9, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_b

    invoke-interface {v9, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    invoke-interface {v2, v3}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    goto :goto_8

    :cond_b
    move-object/from16 v17, v4

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-interface {v9, v2, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v4, v17

    :goto_8
    move-object/from16 v3, v18

    move-object/from16 v2, v19

    goto :goto_7

    :cond_c
    move-object/from16 v19, v2

    move-object/from16 v18, v3

    move-object/from16 v17, v4

    invoke-virtual {v7, v6, v8}, Lcom/google/android/gms/internal/ads/wn;->a(Ljava/net/HttpURLConnection;I)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    const/16 v2, 0xc8

    const/16 v3, 0x12c

    if-lt v8, v2, :cond_f

    if-ge v8, v3, :cond_f

    :try_start_5
    new-instance v2, Ljava/io/InputStreamReader;

    invoke-virtual {v6}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    :try_start_6
    invoke-static {}, Lcom/google/android/gms/ads/internal/q;->c()Lcom/google/android/gms/internal/ads/gl;

    invoke-static {v2}, Lcom/google/android/gms/internal/ads/gl;->a(Ljava/io/InputStreamReader;)Ljava/lang/String;

    move-result-object v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    :try_start_7
    invoke-static {v2}, Lcom/google/android/gms/common/util/j;->a(Ljava/io/Closeable;)V

    invoke-virtual {v7, v0}, Lcom/google/android/gms/internal/ads/wn;->a(Ljava/lang/String;)V

    iput v8, v5, Lcom/google/android/gms/internal/ads/is0;->a:I

    iput-object v0, v5, Lcom/google/android/gms/internal/ads/is0;->c:Ljava/lang/String;

    iput-object v9, v5, Lcom/google/android/gms/internal/ads/is0;->b:Ljava/util/Map;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_e

    sget-object v0, Lcom/google/android/gms/internal/ads/zr2;->u2:Lcom/google/android/gms/internal/ads/kr2;

    invoke-static {}, Lcom/google/android/gms/internal/ads/on2;->e()Lcom/google/android/gms/internal/ads/vr2;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/ads/vr2;->a(Lcom/google/android/gms/internal/ads/kr2;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_d

    goto :goto_9

    :cond_d
    new-instance v0, Lcom/google/android/gms/internal/ads/nr0;

    const-string v2, "No Fill"

    const/4 v3, 0x3

    invoke-direct {v0, v2, v3}, Lcom/google/android/gms/internal/ads/nr0;-><init>(Ljava/lang/String;I)V

    throw v0

    :cond_e
    :goto_9
    invoke-static {}, Lcom/google/android/gms/ads/internal/q;->j()Lcom/google/android/gms/common/util/d;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/common/util/d;->b()J

    move-result-wide v2

    sub-long/2addr v2, v10

    iput-wide v2, v5, Lcom/google/android/gms/internal/ads/is0;->d:J
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    :try_start_8
    invoke-virtual {v6}, Ljava/net/HttpURLConnection;->disconnect()V

    iget-object v0, v1, Lcom/google/android/gms/internal/ads/gs0;->c:Lcom/google/android/gms/internal/ads/rg;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/rg;->a()V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_0

    return-object v5

    :catchall_2
    move-exception v0

    move-object v7, v2

    goto :goto_a

    :catchall_3
    move-exception v0

    const/4 v7, 0x0

    :goto_a
    :try_start_9
    invoke-static {v7}, Lcom/google/android/gms/common/util/j;->a(Ljava/io/Closeable;)V

    throw v0

    :cond_f
    if-lt v8, v3, :cond_12

    const/16 v2, 0x190

    if-ge v8, v2, :cond_12

    const-string v2, "Location"

    invoke-virtual {v6, v2}, Ljava/net/HttpURLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_11

    new-instance v3, Ljava/net/URL;

    invoke-direct {v3, v2}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    const/4 v2, 0x1

    add-int/2addr v12, v2

    sget-object v4, Lcom/google/android/gms/internal/ads/zr2;->l2:Lcom/google/android/gms/internal/ads/kr2;

    invoke-static {}, Lcom/google/android/gms/internal/ads/on2;->e()Lcom/google/android/gms/internal/ads/vr2;

    move-result-object v7

    invoke-virtual {v7, v4}, Lcom/google/android/gms/internal/ads/vr2;->a(Lcom/google/android/gms/internal/ads/kr2;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    if-gt v12, v4, :cond_10

    :try_start_a
    invoke-virtual {v6}, Ljava/net/HttpURLConnection;->disconnect()V

    iget-object v4, v1, Lcom/google/android/gms/internal/ads/gs0;->c:Lcom/google/android/gms/internal/ads/rg;

    invoke-interface {v4}, Lcom/google/android/gms/internal/ads/rg;->a()V
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_0

    move-object v6, v3

    move-object/from16 v4, v17

    move-object/from16 v3, v18

    move-object/from16 v2, v19

    const/4 v7, 0x0

    const/4 v8, 0x1

    goto/16 :goto_2

    :cond_10
    :try_start_b
    const-string v0, "Too many redirects."

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/co;->d(Ljava/lang/String;)V

    new-instance v0, Lcom/google/android/gms/internal/ads/nr0;

    const-string v2, "Too many redirects"

    invoke-direct {v0, v2}, Lcom/google/android/gms/internal/ads/nr0;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_11
    const-string v0, "No location header to follow redirect."

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/co;->d(Ljava/lang/String;)V

    new-instance v0, Lcom/google/android/gms/internal/ads/nr0;

    const-string v2, "No location header to follow redirect"

    invoke-direct {v0, v2}, Lcom/google/android/gms/internal/ads/nr0;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_12
    new-instance v2, Ljava/lang/StringBuilder;

    const/16 v3, 0x2e

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/google/android/gms/internal/ads/co;->d(Ljava/lang/String;)V

    new-instance v2, Lcom/google/android/gms/internal/ads/nr0;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Lcom/google/android/gms/internal/ads/nr0;-><init>(Ljava/lang/String;)V

    throw v2
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_4

    :catchall_4
    move-exception v0

    :try_start_c
    invoke-virtual {v6}, Ljava/net/HttpURLConnection;->disconnect()V

    iget-object v2, v1, Lcom/google/android/gms/internal/ads/gs0;->c:Lcom/google/android/gms/internal/ads/rg;

    invoke-interface {v2}, Lcom/google/android/gms/internal/ads/rg;->a()V

    throw v0
    :try_end_c
    .catch Ljava/io/IOException; {:try_start_c .. :try_end_c} :catch_0

    :catch_0
    move-exception v0

    const-string v2, "Error while connecting to ad server: "

    invoke-virtual {v0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v4

    if-eqz v4, :cond_13

    invoke-virtual {v2, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    goto :goto_b

    :cond_13
    new-instance v3, Ljava/lang/String;

    invoke-direct {v3, v2}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    move-object v2, v3

    :goto_b
    invoke-static {v2}, Lcom/google/android/gms/internal/ads/co;->d(Ljava/lang/String;)V

    new-instance v2, Lcom/google/android/gms/internal/ads/nr0;

    const-string v3, "Error connecting to ad server:"

    invoke-virtual {v0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v4

    if-eqz v4, :cond_14

    invoke-virtual {v3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_c

    :cond_14
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v3}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    :goto_c
    const/4 v3, 0x2

    invoke-direct {v2, v0, v3}, Lcom/google/android/gms/internal/ads/nr0;-><init>(Ljava/lang/String;I)V

    throw v2
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    check-cast p1, Lcom/google/android/gms/internal/ads/fs0;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/fs0;->a(Lcom/google/android/gms/internal/ads/fs0;)Lcom/google/android/gms/internal/ads/fg;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/fg;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/fs0;->a(Lcom/google/android/gms/internal/ads/fs0;)Lcom/google/android/gms/internal/ads/fg;

    move-result-object v1

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/fs0;->b(Lcom/google/android/gms/internal/ads/fs0;)Lorg/json/JSONObject;

    move-result-object p1

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/gs0;->d:Ljava/lang/String;

    invoke-direct {p0, v0, v1, p1, v2}, Lcom/google/android/gms/internal/ads/gs0;->a(Ljava/lang/String;Lcom/google/android/gms/internal/ads/fg;Lorg/json/JSONObject;Ljava/lang/String;)Lcom/google/android/gms/internal/ads/is0;

    move-result-object p1

    return-object p1
.end method
