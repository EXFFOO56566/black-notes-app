.class final Lcom/google/android/gms/internal/ads/fb2;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public A:F

.field public B:F

.field public C:F

.field public D:F

.field public E:F

.field public F:F

.field public G:I

.field public H:I

.field public I:I

.field public J:J

.field public K:J

.field public L:Z

.field public M:Z

.field private N:Ljava/lang/String;

.field public O:Lcom/google/android/gms/internal/ads/ua2;

.field public P:I

.field public a:Ljava/lang/String;

.field public b:I

.field public c:I

.field public d:I

.field public e:Z

.field public f:[B

.field public g:Lcom/google/android/gms/internal/ads/xa2;

.field public h:[B

.field public i:Lcom/google/android/gms/internal/ads/ba2;

.field public j:I

.field public k:I

.field public l:I

.field public m:I

.field public n:I

.field public o:[B

.field public p:I

.field public q:Z

.field public r:I

.field public s:I

.field public t:I

.field public u:I

.field public v:I

.field public w:F

.field public x:F

.field public y:F

.field public z:F


# direct methods
.method private constructor <init>()V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lcom/google/android/gms/internal/ads/fb2;->j:I

    iput v0, p0, Lcom/google/android/gms/internal/ads/fb2;->k:I

    iput v0, p0, Lcom/google/android/gms/internal/ads/fb2;->l:I

    iput v0, p0, Lcom/google/android/gms/internal/ads/fb2;->m:I

    const/4 v1, 0x0

    iput v1, p0, Lcom/google/android/gms/internal/ads/fb2;->n:I

    const/4 v2, 0x0

    iput-object v2, p0, Lcom/google/android/gms/internal/ads/fb2;->o:[B

    iput v0, p0, Lcom/google/android/gms/internal/ads/fb2;->p:I

    iput-boolean v1, p0, Lcom/google/android/gms/internal/ads/fb2;->q:Z

    iput v0, p0, Lcom/google/android/gms/internal/ads/fb2;->r:I

    iput v0, p0, Lcom/google/android/gms/internal/ads/fb2;->s:I

    iput v0, p0, Lcom/google/android/gms/internal/ads/fb2;->t:I

    const/16 v1, 0x3e8

    iput v1, p0, Lcom/google/android/gms/internal/ads/fb2;->u:I

    const/16 v1, 0xc8

    iput v1, p0, Lcom/google/android/gms/internal/ads/fb2;->v:I

    const/high16 v1, -0x40800000    # -1.0f

    iput v1, p0, Lcom/google/android/gms/internal/ads/fb2;->w:F

    iput v1, p0, Lcom/google/android/gms/internal/ads/fb2;->x:F

    iput v1, p0, Lcom/google/android/gms/internal/ads/fb2;->y:F

    iput v1, p0, Lcom/google/android/gms/internal/ads/fb2;->z:F

    iput v1, p0, Lcom/google/android/gms/internal/ads/fb2;->A:F

    iput v1, p0, Lcom/google/android/gms/internal/ads/fb2;->B:F

    iput v1, p0, Lcom/google/android/gms/internal/ads/fb2;->C:F

    iput v1, p0, Lcom/google/android/gms/internal/ads/fb2;->D:F

    iput v1, p0, Lcom/google/android/gms/internal/ads/fb2;->E:F

    iput v1, p0, Lcom/google/android/gms/internal/ads/fb2;->F:F

    const/4 v1, 0x1

    iput v1, p0, Lcom/google/android/gms/internal/ads/fb2;->G:I

    iput v0, p0, Lcom/google/android/gms/internal/ads/fb2;->H:I

    const/16 v0, 0x1f40

    iput v0, p0, Lcom/google/android/gms/internal/ads/fb2;->I:I

    const-wide/16 v2, 0x0

    iput-wide v2, p0, Lcom/google/android/gms/internal/ads/fb2;->J:J

    iput-wide v2, p0, Lcom/google/android/gms/internal/ads/fb2;->K:J

    iput-boolean v1, p0, Lcom/google/android/gms/internal/ads/fb2;->M:Z

    const-string v0, "eng"

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/fb2;->N:Ljava/lang/String;

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/ads/db2;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/fb2;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/ads/fb2;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/fb2;->N:Ljava/lang/String;

    return-object p1
.end method

.method private static a(Lcom/google/android/gms/internal/ads/xf2;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ads/xf2;",
            ")",
            "Ljava/util/List<",
            "[B>;"
        }
    .end annotation

    const/16 v0, 0x10

    :try_start_0
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/xf2;->d(I)V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/xf2;->m()J

    move-result-wide v0

    const-wide/32 v2, 0x31435657

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/xf2;->b()I

    move-result v0

    add-int/lit8 v0, v0, 0x14

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/xf2;->a:[B

    :goto_0
    array-length v1, p0

    add-int/lit8 v1, v1, -0x4

    if-ge v0, v1, :cond_2

    aget-byte v1, p0, v0

    if-nez v1, :cond_1

    add-int/lit8 v1, v0, 0x1

    aget-byte v1, p0, v1

    if-nez v1, :cond_1

    add-int/lit8 v1, v0, 0x2

    aget-byte v1, p0, v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_1

    add-int/lit8 v1, v0, 0x3

    aget-byte v1, p0, v1

    const/16 v2, 0xf

    if-ne v1, v2, :cond_1

    array-length v1, p0

    invoke-static {p0, v0, v1}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object p0

    invoke-static {p0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    return-object p0

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    new-instance p0, Lcom/google/android/gms/internal/ads/h82;

    const-string v0, "Failed to find FourCC VC1 initialization data"

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/h82;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    new-instance p0, Lcom/google/android/gms/internal/ads/h82;

    const-string v0, "Error parsing FourCC VC1 codec private"

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/h82;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static a([B)Ljava/util/List;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([B)",
            "Ljava/util/List<",
            "[B>;"
        }
    .end annotation

    const-string v0, "Error parsing vorbis codec private"

    const/4 v1, 0x0

    :try_start_0
    aget-byte v2, p0, v1

    const/4 v3, 0x2

    if-ne v2, v3, :cond_5

    const/4 v2, 0x1

    const/4 v4, 0x1

    const/4 v5, 0x0

    :goto_0
    aget-byte v6, p0, v4

    const/4 v7, -0x1

    if-ne v6, v7, :cond_0

    add-int/lit16 v5, v5, 0xff

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    add-int/lit8 v6, v4, 0x1

    aget-byte v4, p0, v4

    add-int/2addr v5, v4

    const/4 v4, 0x0

    :goto_1
    aget-byte v8, p0, v6

    if-ne v8, v7, :cond_1

    add-int/lit16 v4, v4, 0xff

    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :cond_1
    add-int/lit8 v7, v6, 0x1

    aget-byte v6, p0, v6

    add-int/2addr v4, v6

    aget-byte v6, p0, v7

    if-ne v6, v2, :cond_4

    new-array v2, v5, [B

    invoke-static {p0, v7, v2, v1, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/2addr v7, v5

    aget-byte v5, p0, v7

    const/4 v6, 0x3

    if-ne v5, v6, :cond_3

    add-int/2addr v7, v4

    aget-byte v4, p0, v7

    const/4 v5, 0x5

    if-ne v4, v5, :cond_2

    array-length v4, p0

    sub-int/2addr v4, v7

    new-array v4, v4, [B

    array-length v5, p0

    sub-int/2addr v5, v7

    invoke-static {p0, v7, v4, v1, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-interface {p0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0

    :cond_2
    new-instance p0, Lcom/google/android/gms/internal/ads/h82;

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/h82;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_3
    new-instance p0, Lcom/google/android/gms/internal/ads/h82;

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/h82;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_4
    new-instance p0, Lcom/google/android/gms/internal/ads/h82;

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/h82;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_5
    new-instance p0, Lcom/google/android/gms/internal/ads/h82;

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/h82;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    new-instance p0, Lcom/google/android/gms/internal/ads/h82;

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/h82;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static b(Lcom/google/android/gms/internal/ads/xf2;)Z
    .locals 8

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/xf2;->k()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    const v2, 0xfffe

    const/4 v3, 0x0

    if-ne v0, v2, :cond_1

    const/16 v0, 0x18

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/xf2;->c(I)V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/xf2;->e()J

    move-result-wide v4

    invoke-static {}, Lcom/google/android/gms/internal/ads/eb2;->c()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->getMostSignificantBits()J

    move-result-wide v6

    cmp-long v0, v4, v6

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/xf2;->e()J

    move-result-wide v4

    invoke-static {}, Lcom/google/android/gms/internal/ads/eb2;->c()Ljava/util/UUID;

    move-result-object p0

    invoke-virtual {p0}, Ljava/util/UUID;->getLeastSignificantBits()J

    move-result-wide v6
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    cmp-long p0, v4, v6

    if-nez p0, :cond_1

    return v1

    :cond_1
    return v3

    :catch_0
    new-instance p0, Lcom/google/android/gms/internal/ads/h82;

    const-string v0, "Error parsing MS/ACM codec private"

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/h82;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/ads/pa2;I)V
    .locals 42

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/fb2;->a:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v2

    const/4 v4, 0x4

    const/16 v5, 0x8

    const/4 v6, 0x1

    const/4 v7, 0x2

    const/4 v8, 0x0

    const/4 v9, 0x3

    const/4 v10, -0x1

    sparse-switch v2, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string v2, "A_OPUS"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v1, 0xb

    goto/16 :goto_1

    :sswitch_1
    const-string v2, "A_FLAC"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v1, 0x15

    goto/16 :goto_1

    :sswitch_2
    const-string v2, "A_EAC3"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v1, 0x10

    goto/16 :goto_1

    :sswitch_3
    const-string v2, "V_MPEG2"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x2

    goto/16 :goto_1

    :sswitch_4
    const-string v2, "S_TEXT/UTF8"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v1, 0x18

    goto/16 :goto_1

    :sswitch_5
    const-string v2, "V_MPEGH/ISO/HEVC"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x7

    goto/16 :goto_1

    :sswitch_6
    const-string v2, "A_PCM/INT/LIT"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v1, 0x17

    goto/16 :goto_1

    :sswitch_7
    const-string v2, "A_DTS/EXPRESS"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v1, 0x13

    goto/16 :goto_1

    :sswitch_8
    const-string v2, "V_THEORA"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v1, 0x9

    goto/16 :goto_1

    :sswitch_9
    const-string v2, "S_HDMV/PGS"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v1, 0x1a

    goto/16 :goto_1

    :sswitch_a
    const-string v2, "V_VP9"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto/16 :goto_1

    :sswitch_b
    const-string v2, "V_VP8"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    goto/16 :goto_1

    :sswitch_c
    const-string v2, "A_DTS"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v1, 0x12

    goto/16 :goto_1

    :sswitch_d
    const-string v2, "A_AC3"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v1, 0xf

    goto/16 :goto_1

    :sswitch_e
    const-string v2, "A_AAC"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v1, 0xc

    goto/16 :goto_1

    :sswitch_f
    const-string v2, "A_DTS/LOSSLESS"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v1, 0x14

    goto/16 :goto_1

    :sswitch_10
    const-string v2, "S_VOBSUB"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v1, 0x19

    goto/16 :goto_1

    :sswitch_11
    const-string v2, "V_MPEG4/ISO/AVC"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x6

    goto/16 :goto_1

    :sswitch_12
    const-string v2, "V_MPEG4/ISO/ASP"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto/16 :goto_1

    :sswitch_13
    const-string v2, "S_DVBSUB"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v1, 0x1b

    goto :goto_1

    :sswitch_14
    const-string v2, "V_MS/VFW/FOURCC"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v1, 0x8

    goto :goto_1

    :sswitch_15
    const-string v2, "A_MPEG/L3"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v1, 0xe

    goto :goto_1

    :sswitch_16
    const-string v2, "A_MPEG/L2"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v1, 0xd

    goto :goto_1

    :sswitch_17
    const-string v2, "A_VORBIS"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v1, 0xa

    goto :goto_1

    :sswitch_18
    const-string v2, "A_TRUEHD"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v1, 0x11

    goto :goto_1

    :sswitch_19
    const-string v2, "A_MS/ACM"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v1, 0x16

    goto :goto_1

    :sswitch_1a
    const-string v2, "V_MPEG4/ISO/SP"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x3

    goto :goto_1

    :sswitch_1b
    const-string v2, "V_MPEG4/ISO/AP"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x5

    goto :goto_1

    :cond_0
    :goto_0
    const/4 v1, -0x1

    :goto_1
    const-string v2, "application/dvbsubs"

    const-string v11, "application/pgs"

    const-string v12, "application/vobsub"

    const-string v13, "application/x-subrip"

    const-string v14, "audio/raw"

    const-string v16, "video/x-unknown"

    const-string v15, "audio/x-unknown"

    const-string v3, "MatroskaExtractor"

    const/16 v17, 0x0

    packed-switch v1, :pswitch_data_0

    new-instance v1, Lcom/google/android/gms/internal/ads/h82;

    const-string v2, "Unrecognized codec identifier."

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/ads/h82;-><init>(Ljava/lang/String;)V

    throw v1

    :pswitch_0
    new-array v1, v4, [B

    iget-object v3, v0, Lcom/google/android/gms/internal/ads/fb2;->h:[B

    aget-byte v4, v3, v8

    aput-byte v4, v1, v8

    aget-byte v4, v3, v6

    aput-byte v4, v1, v6

    aget-byte v4, v3, v7

    aput-byte v4, v1, v7

    aget-byte v3, v3, v9

    aput-byte v3, v1, v9

    invoke-static {v1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    move-object v3, v1

    move-object v1, v2

    goto/16 :goto_b

    :pswitch_1
    move-object v1, v11

    goto/16 :goto_a

    :pswitch_2
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/fb2;->h:[B

    invoke-static {v1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    move-object v3, v1

    move-object v1, v12

    goto/16 :goto_b

    :pswitch_3
    move-object v1, v13

    goto/16 :goto_a

    :pswitch_4
    iget v1, v0, Lcom/google/android/gms/internal/ads/fb2;->H:I

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/ag2;->a(I)I

    move-result v1

    if-nez v1, :cond_1

    iget v1, v0, Lcom/google/android/gms/internal/ads/fb2;->H:I

    invoke-virtual {v15}, Ljava/lang/String;->length()I

    move-result v4

    add-int/lit8 v4, v4, 0x3c

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    :goto_2
    const-string v4, "Unsupported PCM bit depth: "

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ". Setting mimeType to "

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :goto_3
    invoke-static {v3, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    move-object v1, v15

    goto/16 :goto_a

    :cond_1
    move/from16 v25, v1

    move-object v1, v14

    move-object/from16 v3, v17

    goto/16 :goto_c

    :pswitch_5
    new-instance v1, Lcom/google/android/gms/internal/ads/xf2;

    iget-object v4, v0, Lcom/google/android/gms/internal/ads/fb2;->h:[B

    invoke-direct {v1, v4}, Lcom/google/android/gms/internal/ads/xf2;-><init>([B)V

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/fb2;->b(Lcom/google/android/gms/internal/ads/xf2;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget v1, v0, Lcom/google/android/gms/internal/ads/fb2;->H:I

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/ag2;->a(I)I

    move-result v1

    if-nez v1, :cond_1

    iget v1, v0, Lcom/google/android/gms/internal/ads/fb2;->H:I

    invoke-virtual {v15}, Ljava/lang/String;->length()I

    move-result v4

    add-int/lit8 v4, v4, 0x3c

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    goto :goto_2

    :cond_2
    const-string v1, "Non-PCM MS/ACM is unsupported. Setting mimeType to "

    invoke-virtual {v15}, Ljava/lang/String;->length()I

    move-result v4

    if-eqz v4, :cond_3

    invoke-virtual {v1, v15}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto :goto_3

    :cond_3
    new-instance v4, Ljava/lang/String;

    invoke-direct {v4, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    move-object v1, v4

    goto :goto_3

    :pswitch_6
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/fb2;->h:[B

    invoke-static {v1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    const-string v14, "audio/x-flac"

    goto :goto_6

    :pswitch_7
    const-string v14, "audio/vnd.dts.hd"

    goto :goto_4

    :pswitch_8
    const-string v14, "audio/vnd.dts"

    goto :goto_4

    :pswitch_9
    const-string v14, "audio/true-hd"

    goto :goto_4

    :pswitch_a
    const-string v14, "audio/eac3"

    goto :goto_4

    :pswitch_b
    const-string v14, "audio/ac3"

    :goto_4
    move-object v1, v14

    goto/16 :goto_a

    :pswitch_c
    const-string v14, "audio/mpeg"

    goto :goto_5

    :pswitch_d
    const-string v14, "audio/mpeg-L2"

    :goto_5
    move-object v1, v14

    move-object/from16 v3, v17

    const/16 v25, -0x1

    const/16 v30, 0x1000

    goto/16 :goto_d

    :pswitch_e
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/fb2;->h:[B

    invoke-static {v1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    const-string v14, "audio/mp4a-latm"

    :goto_6
    move-object v3, v1

    move-object v1, v14

    goto/16 :goto_b

    :pswitch_f
    const/16 v15, 0x1680

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v9}, Ljava/util/ArrayList;-><init>(I)V

    iget-object v3, v0, Lcom/google/android/gms/internal/ads/fb2;->h:[B

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-static {v5}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v3

    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v3

    iget-wide v6, v0, Lcom/google/android/gms/internal/ads/fb2;->J:J

    invoke-virtual {v3, v6, v7}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    move-result-object v3

    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-static {v5}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v3

    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v3

    iget-wide v5, v0, Lcom/google/android/gms/internal/ads/fb2;->K:J

    invoke-virtual {v3, v5, v6}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    move-result-object v3

    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const-string v3, "audio/opus"

    const/16 v25, -0x1

    const/16 v30, 0x1680

    goto :goto_7

    :pswitch_10
    const/16 v15, 0x2000

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/fb2;->h:[B

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/fb2;->a([B)Ljava/util/List;

    move-result-object v1

    const-string v3, "audio/vorbis"

    const/16 v25, -0x1

    const/16 v30, 0x2000

    :goto_7
    move-object/from16 v41, v3

    move-object v3, v1

    move-object/from16 v1, v41

    goto/16 :goto_d

    :pswitch_11
    move-object/from16 v1, v16

    goto :goto_a

    :pswitch_12
    new-instance v1, Lcom/google/android/gms/internal/ads/xf2;

    iget-object v5, v0, Lcom/google/android/gms/internal/ads/fb2;->h:[B

    invoke-direct {v1, v5}, Lcom/google/android/gms/internal/ads/xf2;-><init>([B)V

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/fb2;->a(Lcom/google/android/gms/internal/ads/xf2;)Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_4

    const-string v3, "video/wvc1"

    :goto_8
    const/16 v25, -0x1

    const/16 v30, -0x1

    goto :goto_7

    :cond_4
    const-string v5, "Unsupported FourCC. Setting mimeType to video/x-unknown"

    invoke-static {v3, v5}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    move-object v3, v1

    move-object/from16 v1, v16

    goto :goto_b

    :pswitch_13
    new-instance v1, Lcom/google/android/gms/internal/ads/xf2;

    iget-object v3, v0, Lcom/google/android/gms/internal/ads/fb2;->h:[B

    invoke-direct {v1, v3}, Lcom/google/android/gms/internal/ads/xf2;-><init>([B)V

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/jg2;->a(Lcom/google/android/gms/internal/ads/xf2;)Lcom/google/android/gms/internal/ads/jg2;

    move-result-object v1

    iget-object v3, v1, Lcom/google/android/gms/internal/ads/jg2;->a:Ljava/util/List;

    iget v1, v1, Lcom/google/android/gms/internal/ads/jg2;->b:I

    iput v1, v0, Lcom/google/android/gms/internal/ads/fb2;->P:I

    const-string v1, "video/hevc"

    goto :goto_b

    :pswitch_14
    new-instance v1, Lcom/google/android/gms/internal/ads/xf2;

    iget-object v3, v0, Lcom/google/android/gms/internal/ads/fb2;->h:[B

    invoke-direct {v1, v3}, Lcom/google/android/gms/internal/ads/xf2;-><init>([B)V

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/cg2;->a(Lcom/google/android/gms/internal/ads/xf2;)Lcom/google/android/gms/internal/ads/cg2;

    move-result-object v1

    iget-object v3, v1, Lcom/google/android/gms/internal/ads/cg2;->a:Ljava/util/List;

    iget v1, v1, Lcom/google/android/gms/internal/ads/cg2;->b:I

    iput v1, v0, Lcom/google/android/gms/internal/ads/fb2;->P:I

    const-string v1, "video/avc"

    goto :goto_b

    :pswitch_15
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/fb2;->h:[B

    if-nez v1, :cond_5

    move-object/from16 v1, v17

    goto :goto_9

    :cond_5
    invoke-static {v1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    :goto_9
    const-string v3, "video/mp4v-es"

    goto :goto_8

    :pswitch_16
    const-string v1, "video/mpeg2"

    goto :goto_a

    :pswitch_17
    const-string v1, "video/x-vnd.on2.vp9"

    goto :goto_a

    :pswitch_18
    const-string v1, "video/x-vnd.on2.vp8"

    :goto_a
    move-object/from16 v3, v17

    :goto_b
    const/16 v25, -0x1

    :goto_c
    const/16 v30, -0x1

    :goto_d
    iget-boolean v5, v0, Lcom/google/android/gms/internal/ads/fb2;->M:Z

    or-int/2addr v5, v8

    iget-boolean v6, v0, Lcom/google/android/gms/internal/ads/fb2;->L:Z

    if-eqz v6, :cond_6

    const/4 v6, 0x2

    goto :goto_e

    :cond_6
    const/4 v6, 0x0

    :goto_e
    or-int/2addr v5, v6

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/tf2;->a(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_7

    invoke-static/range {p2 .. p2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v18

    const/16 v20, 0x0

    const/16 v21, -0x1

    iget v2, v0, Lcom/google/android/gms/internal/ads/fb2;->G:I

    iget v6, v0, Lcom/google/android/gms/internal/ads/fb2;->I:I

    iget-object v7, v0, Lcom/google/android/gms/internal/ads/fb2;->i:Lcom/google/android/gms/internal/ads/ba2;

    iget-object v8, v0, Lcom/google/android/gms/internal/ads/fb2;->N:Ljava/lang/String;

    move-object/from16 v19, v1

    move/from16 v22, v30

    move/from16 v23, v2

    move/from16 v24, v6

    move-object/from16 v26, v3

    move-object/from16 v27, v7

    move/from16 v28, v5

    move-object/from16 v29, v8

    invoke-static/range {v18 .. v29}, Lcom/google/android/gms/internal/ads/e82;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIIILjava/util/List;Lcom/google/android/gms/internal/ads/ba2;ILjava/lang/String;)Lcom/google/android/gms/internal/ads/e82;

    move-result-object v1

    const/4 v6, 0x1

    goto/16 :goto_15

    :cond_7
    invoke-static {v1}, Lcom/google/android/gms/internal/ads/tf2;->b(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_f

    iget v2, v0, Lcom/google/android/gms/internal/ads/fb2;->n:I

    if-nez v2, :cond_a

    iget v2, v0, Lcom/google/android/gms/internal/ads/fb2;->l:I

    if-ne v2, v10, :cond_8

    iget v2, v0, Lcom/google/android/gms/internal/ads/fb2;->j:I

    :cond_8
    iput v2, v0, Lcom/google/android/gms/internal/ads/fb2;->l:I

    iget v2, v0, Lcom/google/android/gms/internal/ads/fb2;->m:I

    if-ne v2, v10, :cond_9

    iget v2, v0, Lcom/google/android/gms/internal/ads/fb2;->k:I

    :cond_9
    iput v2, v0, Lcom/google/android/gms/internal/ads/fb2;->m:I

    :cond_a
    iget v2, v0, Lcom/google/android/gms/internal/ads/fb2;->l:I

    const/high16 v4, -0x40800000    # -1.0f

    if-eq v2, v10, :cond_b

    iget v5, v0, Lcom/google/android/gms/internal/ads/fb2;->m:I

    if-eq v5, v10, :cond_b

    iget v6, v0, Lcom/google/android/gms/internal/ads/fb2;->k:I

    mul-int v6, v6, v2

    int-to-float v2, v6

    iget v6, v0, Lcom/google/android/gms/internal/ads/fb2;->j:I

    mul-int v6, v6, v5

    int-to-float v5, v6

    div-float/2addr v2, v5

    move/from16 v36, v2

    goto :goto_f

    :cond_b
    const/high16 v36, -0x40800000    # -1.0f

    :goto_f
    iget-boolean v2, v0, Lcom/google/android/gms/internal/ads/fb2;->q:Z

    if-eqz v2, :cond_e

    iget v2, v0, Lcom/google/android/gms/internal/ads/fb2;->w:F

    cmpl-float v2, v2, v4

    if-eqz v2, :cond_d

    iget v2, v0, Lcom/google/android/gms/internal/ads/fb2;->x:F

    cmpl-float v2, v2, v4

    if-eqz v2, :cond_d

    iget v2, v0, Lcom/google/android/gms/internal/ads/fb2;->y:F

    cmpl-float v2, v2, v4

    if-eqz v2, :cond_d

    iget v2, v0, Lcom/google/android/gms/internal/ads/fb2;->z:F

    cmpl-float v2, v2, v4

    if-eqz v2, :cond_d

    iget v2, v0, Lcom/google/android/gms/internal/ads/fb2;->A:F

    cmpl-float v2, v2, v4

    if-eqz v2, :cond_d

    iget v2, v0, Lcom/google/android/gms/internal/ads/fb2;->B:F

    cmpl-float v2, v2, v4

    if-eqz v2, :cond_d

    iget v2, v0, Lcom/google/android/gms/internal/ads/fb2;->C:F

    cmpl-float v2, v2, v4

    if-eqz v2, :cond_d

    iget v2, v0, Lcom/google/android/gms/internal/ads/fb2;->D:F

    cmpl-float v2, v2, v4

    if-eqz v2, :cond_d

    iget v2, v0, Lcom/google/android/gms/internal/ads/fb2;->E:F

    cmpl-float v2, v2, v4

    if-eqz v2, :cond_d

    iget v2, v0, Lcom/google/android/gms/internal/ads/fb2;->F:F

    cmpl-float v2, v2, v4

    if-nez v2, :cond_c

    goto/16 :goto_10

    :cond_c
    const/16 v2, 0x19

    new-array v2, v2, [B

    invoke-static {v2}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v4

    invoke-virtual {v4, v8}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    iget v5, v0, Lcom/google/android/gms/internal/ads/fb2;->w:F

    const v6, 0x47435000    # 50000.0f

    mul-float v5, v5, v6

    const/high16 v7, 0x3f000000    # 0.5f

    add-float/2addr v5, v7

    float-to-int v5, v5

    int-to-short v5, v5

    invoke-virtual {v4, v5}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    iget v5, v0, Lcom/google/android/gms/internal/ads/fb2;->x:F

    mul-float v5, v5, v6

    add-float/2addr v5, v7

    float-to-int v5, v5

    int-to-short v5, v5

    invoke-virtual {v4, v5}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    iget v5, v0, Lcom/google/android/gms/internal/ads/fb2;->y:F

    mul-float v5, v5, v6

    add-float/2addr v5, v7

    float-to-int v5, v5

    int-to-short v5, v5

    invoke-virtual {v4, v5}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    iget v5, v0, Lcom/google/android/gms/internal/ads/fb2;->z:F

    mul-float v5, v5, v6

    add-float/2addr v5, v7

    float-to-int v5, v5

    int-to-short v5, v5

    invoke-virtual {v4, v5}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    iget v5, v0, Lcom/google/android/gms/internal/ads/fb2;->A:F

    mul-float v5, v5, v6

    add-float/2addr v5, v7

    float-to-int v5, v5

    int-to-short v5, v5

    invoke-virtual {v4, v5}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    iget v5, v0, Lcom/google/android/gms/internal/ads/fb2;->B:F

    mul-float v5, v5, v6

    add-float/2addr v5, v7

    float-to-int v5, v5

    int-to-short v5, v5

    invoke-virtual {v4, v5}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    iget v5, v0, Lcom/google/android/gms/internal/ads/fb2;->C:F

    mul-float v5, v5, v6

    add-float/2addr v5, v7

    float-to-int v5, v5

    int-to-short v5, v5

    invoke-virtual {v4, v5}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    iget v5, v0, Lcom/google/android/gms/internal/ads/fb2;->D:F

    mul-float v5, v5, v6

    add-float/2addr v5, v7

    float-to-int v5, v5

    int-to-short v5, v5

    invoke-virtual {v4, v5}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    iget v5, v0, Lcom/google/android/gms/internal/ads/fb2;->E:F

    add-float/2addr v5, v7

    float-to-int v5, v5

    int-to-short v5, v5

    invoke-virtual {v4, v5}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    iget v5, v0, Lcom/google/android/gms/internal/ads/fb2;->F:F

    add-float/2addr v5, v7

    float-to-int v5, v5

    int-to-short v5, v5

    invoke-virtual {v4, v5}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    iget v5, v0, Lcom/google/android/gms/internal/ads/fb2;->u:I

    int-to-short v5, v5

    invoke-virtual {v4, v5}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    iget v5, v0, Lcom/google/android/gms/internal/ads/fb2;->v:I

    int-to-short v5, v5

    invoke-virtual {v4, v5}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    goto :goto_11

    :cond_d
    :goto_10
    move-object/from16 v2, v17

    :goto_11
    new-instance v4, Lcom/google/android/gms/internal/ads/gg2;

    iget v5, v0, Lcom/google/android/gms/internal/ads/fb2;->r:I

    iget v6, v0, Lcom/google/android/gms/internal/ads/fb2;->t:I

    iget v7, v0, Lcom/google/android/gms/internal/ads/fb2;->s:I

    invoke-direct {v4, v5, v6, v7, v2}, Lcom/google/android/gms/internal/ads/gg2;-><init>(III[B)V

    move-object/from16 v39, v4

    goto :goto_12

    :cond_e
    move-object/from16 v39, v17

    :goto_12
    invoke-static/range {p2 .. p2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v26

    const/16 v28, 0x0

    const/16 v29, -0x1

    iget v2, v0, Lcom/google/android/gms/internal/ads/fb2;->j:I

    iget v4, v0, Lcom/google/android/gms/internal/ads/fb2;->k:I

    const/high16 v33, -0x40800000    # -1.0f

    const/16 v35, -0x1

    iget-object v5, v0, Lcom/google/android/gms/internal/ads/fb2;->o:[B

    iget v6, v0, Lcom/google/android/gms/internal/ads/fb2;->p:I

    iget-object v7, v0, Lcom/google/android/gms/internal/ads/fb2;->i:Lcom/google/android/gms/internal/ads/ba2;

    move-object/from16 v27, v1

    move/from16 v31, v2

    move/from16 v32, v4

    move-object/from16 v34, v3

    move-object/from16 v37, v5

    move/from16 v38, v6

    move-object/from16 v40, v7

    invoke-static/range {v26 .. v40}, Lcom/google/android/gms/internal/ads/e82;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIIFLjava/util/List;IF[BILcom/google/android/gms/internal/ads/gg2;Lcom/google/android/gms/internal/ads/ba2;)Lcom/google/android/gms/internal/ads/e82;

    move-result-object v1

    const/4 v6, 0x2

    goto :goto_15

    :cond_f
    invoke-virtual {v13, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_10

    invoke-static/range {p2 .. p2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v18

    const/16 v20, 0x0

    const/16 v21, -0x1

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/fb2;->N:Ljava/lang/String;

    iget-object v3, v0, Lcom/google/android/gms/internal/ads/fb2;->i:Lcom/google/android/gms/internal/ads/ba2;

    move-object/from16 v19, v1

    move/from16 v22, v5

    move-object/from16 v23, v2

    move-object/from16 v24, v3

    invoke-static/range {v18 .. v24}, Lcom/google/android/gms/internal/ads/e82;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Lcom/google/android/gms/internal/ads/ba2;)Lcom/google/android/gms/internal/ads/e82;

    move-result-object v1

    :goto_13
    const/4 v6, 0x3

    goto :goto_15

    :cond_10
    invoke-virtual {v12, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_12

    invoke-virtual {v11, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_12

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_11

    goto :goto_14

    :cond_11
    new-instance v1, Lcom/google/android/gms/internal/ads/h82;

    const-string v2, "Unexpected MIME type."

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/ads/h82;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_12
    :goto_14
    invoke-static/range {p2 .. p2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v18

    const/16 v20, 0x0

    const/16 v21, -0x1

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/fb2;->N:Ljava/lang/String;

    iget-object v4, v0, Lcom/google/android/gms/internal/ads/fb2;->i:Lcom/google/android/gms/internal/ads/ba2;

    move-object/from16 v19, v1

    move-object/from16 v22, v3

    move-object/from16 v23, v2

    move-object/from16 v24, v4

    invoke-static/range {v18 .. v24}, Lcom/google/android/gms/internal/ads/e82;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Ljava/lang/String;Lcom/google/android/gms/internal/ads/ba2;)Lcom/google/android/gms/internal/ads/e82;

    move-result-object v1

    goto :goto_13

    :goto_15
    iget v2, v0, Lcom/google/android/gms/internal/ads/fb2;->b:I

    move-object/from16 v3, p1

    invoke-interface {v3, v2, v6}, Lcom/google/android/gms/internal/ads/pa2;->a(II)Lcom/google/android/gms/internal/ads/ua2;

    move-result-object v2

    iput-object v2, v0, Lcom/google/android/gms/internal/ads/fb2;->O:Lcom/google/android/gms/internal/ads/ua2;

    invoke-interface {v2, v1}, Lcom/google/android/gms/internal/ads/ua2;->a(Lcom/google/android/gms/internal/ads/e82;)V

    return-void

    :sswitch_data_0
    .sparse-switch
        -0x7ce7f5de -> :sswitch_1b
        -0x7ce7f3b0 -> :sswitch_1a
        -0x76567dc0 -> :sswitch_19
        -0x6a615338 -> :sswitch_18
        -0x672350af -> :sswitch_17
        -0x585f4fce -> :sswitch_16
        -0x585f4fcd -> :sswitch_15
        -0x51dc40b2 -> :sswitch_14
        -0x37a9c464 -> :sswitch_13
        -0x2016c535 -> :sswitch_12
        -0x2016c4e5 -> :sswitch_11
        -0x19552dbd -> :sswitch_10
        -0x1538b2ba -> :sswitch_f
        0x3c02325 -> :sswitch_e
        0x3c02353 -> :sswitch_d
        0x3c030c5 -> :sswitch_c
        0x4e86155 -> :sswitch_b
        0x4e86156 -> :sswitch_a
        0x5e8da3e -> :sswitch_9
        0x1a8350d6 -> :sswitch_8
        0x2056f406 -> :sswitch_7
        0x2b453ce4 -> :sswitch_6
        0x32fdf009 -> :sswitch_5
        0x54c61e47 -> :sswitch_4
        0x6bd6c624 -> :sswitch_3
        0x7446132a -> :sswitch_2
        0x7446b0a6 -> :sswitch_1
        0x744ad97d -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_15
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
