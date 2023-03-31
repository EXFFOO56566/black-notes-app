.class public final Lcom/google/android/gms/internal/ads/ba0$f;
.super Lcom/google/android/gms/internal/ads/rz1;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/e12;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/ads/ba0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "f"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/ads/ba0$f$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/ads/rz1<",
        "Lcom/google/android/gms/internal/ads/ba0$f;",
        "Lcom/google/android/gms/internal/ads/ba0$f$a;",
        ">;",
        "Lcom/google/android/gms/internal/ads/e12;"
    }
.end annotation


# static fields
.field private static volatile zzea:Lcom/google/android/gms/internal/ads/l12;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/l12<",
            "Lcom/google/android/gms/internal/ads/ba0$f;",
            ">;"
        }
    .end annotation
.end field

.field private static final zzko:Lcom/google/android/gms/internal/ads/ba0$f;


# instance fields
.field private zzdl:I

.field private zzgu:J

.field private zzgv:J

.field private zzkk:J

.field private zzkl:J

.field private zzkm:J

.field private zzkn:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/ads/ba0$f;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/ba0$f;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/ba0$f;->zzko:Lcom/google/android/gms/internal/ads/ba0$f;

    const-class v1, Lcom/google/android/gms/internal/ads/ba0$f;

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/rz1;->a(Ljava/lang/Class;Lcom/google/android/gms/internal/ads/rz1;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/rz1;-><init>()V

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/ba0$f;->zzgu:J

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/ba0$f;->zzgv:J

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/ba0$f;->zzkk:J

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/ba0$f;->zzkl:J

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/ba0$f;->zzkm:J

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/ba0$f;->zzkn:J

    return-void
.end method

.method private final a(J)V
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/ba0$f;->zzdl:I

    or-int/lit8 v0, v0, 0x4

    iput v0, p0, Lcom/google/android/gms/internal/ads/ba0$f;->zzdl:I

    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/ba0$f;->zzkk:J

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/ads/ba0$f;J)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/ads/ba0$f;->a(J)V

    return-void
.end method

.method private final b(J)V
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/ba0$f;->zzdl:I

    or-int/lit8 v0, v0, 0x8

    iput v0, p0, Lcom/google/android/gms/internal/ads/ba0$f;->zzdl:I

    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/ba0$f;->zzkl:J

    return-void
.end method

.method static synthetic b(Lcom/google/android/gms/internal/ads/ba0$f;J)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/ads/ba0$f;->b(J)V

    return-void
.end method

.method private final c(J)V
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/ba0$f;->zzdl:I

    or-int/lit8 v0, v0, 0x10

    iput v0, p0, Lcom/google/android/gms/internal/ads/ba0$f;->zzdl:I

    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/ba0$f;->zzkm:J

    return-void
.end method

.method static synthetic c(Lcom/google/android/gms/internal/ads/ba0$f;J)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/ads/ba0$f;->c(J)V

    return-void
.end method

.method private final d(J)V
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/ba0$f;->zzdl:I

    or-int/lit8 v0, v0, 0x20

    iput v0, p0, Lcom/google/android/gms/internal/ads/ba0$f;->zzdl:I

    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/ba0$f;->zzkn:J

    return-void
.end method

.method static synthetic d(Lcom/google/android/gms/internal/ads/ba0$f;J)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/ads/ba0$f;->d(J)V

    return-void
.end method

.method public static p()Lcom/google/android/gms/internal/ads/ba0$f$a;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/ba0$f;->zzko:Lcom/google/android/gms/internal/ads/ba0$f;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/rz1;->j()Lcom/google/android/gms/internal/ads/rz1$a;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/ba0$f$a;

    return-object v0
.end method

.method static synthetic q()Lcom/google/android/gms/internal/ads/ba0$f;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/ba0$f;->zzko:Lcom/google/android/gms/internal/ads/ba0$f;

    return-object v0
.end method


# virtual methods
.method protected final a(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    sget-object p2, Lcom/google/android/gms/internal/ads/a90;->a:[I

    const/4 p3, 0x1

    sub-int/2addr p1, p3

    aget p1, p2, p1

    const/4 p2, 0x0

    packed-switch p1, :pswitch_data_0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1

    :pswitch_0
    return-object p2

    :pswitch_1
    invoke-static {p3}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1

    :pswitch_2
    sget-object p1, Lcom/google/android/gms/internal/ads/ba0$f;->zzea:Lcom/google/android/gms/internal/ads/l12;

    if-nez p1, :cond_1

    const-class p2, Lcom/google/android/gms/internal/ads/ba0$f;

    monitor-enter p2

    :try_start_0
    sget-object p1, Lcom/google/android/gms/internal/ads/ba0$f;->zzea:Lcom/google/android/gms/internal/ads/l12;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/android/gms/internal/ads/rz1$c;

    sget-object p3, Lcom/google/android/gms/internal/ads/ba0$f;->zzko:Lcom/google/android/gms/internal/ads/ba0$f;

    invoke-direct {p1, p3}, Lcom/google/android/gms/internal/ads/rz1$c;-><init>(Lcom/google/android/gms/internal/ads/rz1;)V

    sput-object p1, Lcom/google/android/gms/internal/ads/ba0$f;->zzea:Lcom/google/android/gms/internal/ads/l12;

    :cond_0
    monitor-exit p2

    goto :goto_0

    :catchall_0
    move-exception p1

    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_1
    :goto_0
    return-object p1

    :pswitch_3
    sget-object p1, Lcom/google/android/gms/internal/ads/ba0$f;->zzko:Lcom/google/android/gms/internal/ads/ba0$f;

    return-object p1

    :pswitch_4
    const/4 p1, 0x7

    new-array p1, p1, [Ljava/lang/Object;

    const/4 p2, 0x0

    const-string v0, "zzdl"

    aput-object v0, p1, p2

    const-string p2, "zzgu"

    aput-object p2, p1, p3

    const/4 p2, 0x2

    const-string p3, "zzgv"

    aput-object p3, p1, p2

    const/4 p2, 0x3

    const-string p3, "zzkk"

    aput-object p3, p1, p2

    const/4 p2, 0x4

    const-string p3, "zzkl"

    aput-object p3, p1, p2

    const/4 p2, 0x5

    const-string p3, "zzkm"

    aput-object p3, p1, p2

    const/4 p2, 0x6

    const-string p3, "zzkn"

    aput-object p3, p1, p2

    sget-object p2, Lcom/google/android/gms/internal/ads/ba0$f;->zzko:Lcom/google/android/gms/internal/ads/ba0$f;

    const-string p3, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0002\u0000\u0002\u0002\u0001\u0003\u0002\u0002\u0004\u0002\u0003\u0005\u0002\u0004\u0006\u0002\u0005"

    invoke-static {p2, p3, p1}, Lcom/google/android/gms/internal/ads/rz1;->a(Lcom/google/android/gms/internal/ads/c12;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    new-instance p1, Lcom/google/android/gms/internal/ads/ba0$f$a;

    invoke-direct {p1, p2}, Lcom/google/android/gms/internal/ads/ba0$f$a;-><init>(Lcom/google/android/gms/internal/ads/a90;)V

    return-object p1

    :pswitch_6
    new-instance p1, Lcom/google/android/gms/internal/ads/ba0$f;

    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/ba0$f;-><init>()V

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
