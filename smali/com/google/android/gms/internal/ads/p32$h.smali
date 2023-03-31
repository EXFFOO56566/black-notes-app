.class public final Lcom/google/android/gms/internal/ads/p32$h;
.super Lcom/google/android/gms/internal/ads/rz1;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/e12;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/ads/p32;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "h"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/ads/p32$h$b;,
        Lcom/google/android/gms/internal/ads/p32$h$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/ads/rz1<",
        "Lcom/google/android/gms/internal/ads/p32$h;",
        "Lcom/google/android/gms/internal/ads/p32$h$b;",
        ">;",
        "Lcom/google/android/gms/internal/ads/e12;"
    }
.end annotation


# static fields
.field private static volatile zzea:Lcom/google/android/gms/internal/ads/l12;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/l12<",
            "Lcom/google/android/gms/internal/ads/p32$h;",
            ">;"
        }
    .end annotation
.end field

.field private static final zzihs:Lcom/google/android/gms/internal/ads/p32$h;


# instance fields
.field private zzdl:I

.field private zziew:B

.field private zziez:Ljava/lang/String;

.field private zzihk:I

.field private zzihl:Lcom/google/android/gms/internal/ads/p32$d;

.field private zzihm:Lcom/google/android/gms/internal/ads/p32$e;

.field private zzihn:I

.field private zziho:Lcom/google/android/gms/internal/ads/xz1;

.field private zzihp:Ljava/lang/String;

.field private zzihq:I

.field private zzihr:Lcom/google/android/gms/internal/ads/yz1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/yz1<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/ads/p32$h;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/p32$h;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/p32$h;->zzihs:Lcom/google/android/gms/internal/ads/p32$h;

    const-class v1, Lcom/google/android/gms/internal/ads/p32$h;

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/rz1;->a(Ljava/lang/Class;Lcom/google/android/gms/internal/ads/rz1;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/rz1;-><init>()V

    const/4 v0, 0x2

    iput-byte v0, p0, Lcom/google/android/gms/internal/ads/p32$h;->zziew:B

    const-string v0, ""

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/p32$h;->zziez:Ljava/lang/String;

    invoke-static {}, Lcom/google/android/gms/internal/ads/rz1;->m()Lcom/google/android/gms/internal/ads/xz1;

    move-result-object v1

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/p32$h;->zziho:Lcom/google/android/gms/internal/ads/xz1;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/p32$h;->zzihp:Ljava/lang/String;

    invoke-static {}, Lcom/google/android/gms/internal/ads/rz1;->o()Lcom/google/android/gms/internal/ads/yz1;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/p32$h;->zzihr:Lcom/google/android/gms/internal/ads/yz1;

    return-void
.end method

.method private final a(Lcom/google/android/gms/internal/ads/p32$d;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/p32$h;->zzihl:Lcom/google/android/gms/internal/ads/p32$d;

    iget p1, p0, Lcom/google/android/gms/internal/ads/p32$h;->zzdl:I

    or-int/lit8 p1, p1, 0x4

    iput p1, p0, Lcom/google/android/gms/internal/ads/p32$h;->zzdl:I

    return-void
.end method

.method private final a(Lcom/google/android/gms/internal/ads/p32$h$a;)V
    .locals 0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/p32$h$a;->a()I

    move-result p1

    iput p1, p0, Lcom/google/android/gms/internal/ads/p32$h;->zzihq:I

    iget p1, p0, Lcom/google/android/gms/internal/ads/p32$h;->zzdl:I

    or-int/lit8 p1, p1, 0x40

    iput p1, p0, Lcom/google/android/gms/internal/ads/p32$h;->zzdl:I

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/ads/p32$h;I)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/p32$h;->b(I)V

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/ads/p32$h;Lcom/google/android/gms/internal/ads/p32$d;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/p32$h;->a(Lcom/google/android/gms/internal/ads/p32$d;)V

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/ads/p32$h;Lcom/google/android/gms/internal/ads/p32$h$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/p32$h;->a(Lcom/google/android/gms/internal/ads/p32$h$a;)V

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/ads/p32$h;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/p32$h;->a(Ljava/lang/String;)V

    return-void
.end method

.method private final a(Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v0, p0, Lcom/google/android/gms/internal/ads/p32$h;->zzdl:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Lcom/google/android/gms/internal/ads/p32$h;->zzdl:I

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/p32$h;->zziez:Ljava/lang/String;

    return-void
.end method

.method private final b(I)V
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/p32$h;->zzdl:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/google/android/gms/internal/ads/p32$h;->zzdl:I

    iput p1, p0, Lcom/google/android/gms/internal/ads/p32$h;->zzihk:I

    return-void
.end method

.method static synthetic b(Lcom/google/android/gms/internal/ads/p32$h;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/p32$h;->b(Ljava/lang/String;)V

    return-void
.end method

.method private final b(Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/p32$h;->zzihr:Lcom/google/android/gms/internal/ads/yz1;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/yz1;->h()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/p32$h;->zzihr:Lcom/google/android/gms/internal/ads/yz1;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/rz1;->a(Lcom/google/android/gms/internal/ads/yz1;)Lcom/google/android/gms/internal/ads/yz1;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/p32$h;->zzihr:Lcom/google/android/gms/internal/ads/yz1;

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/p32$h;->zzihr:Lcom/google/android/gms/internal/ads/yz1;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public static r()Lcom/google/android/gms/internal/ads/p32$h$b;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/p32$h;->zzihs:Lcom/google/android/gms/internal/ads/p32$h;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/rz1;->j()Lcom/google/android/gms/internal/ads/rz1$a;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/p32$h$b;

    return-object v0
.end method

.method static synthetic s()Lcom/google/android/gms/internal/ads/p32$h;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/p32$h;->zzihs:Lcom/google/android/gms/internal/ads/p32$h;

    return-object v0
.end method


# virtual methods
.method protected final a(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    sget-object p3, Lcom/google/android/gms/internal/ads/n32;->a:[I

    const/4 v0, 0x1

    sub-int/2addr p1, v0

    aget p1, p3, p1

    const/4 p3, 0x0

    const/4 v1, 0x0

    packed-switch p1, :pswitch_data_0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1

    :pswitch_0
    if-nez p2, :cond_0

    const/4 v0, 0x0

    :cond_0
    int-to-byte p1, v0

    iput-byte p1, p0, Lcom/google/android/gms/internal/ads/p32$h;->zziew:B

    return-object v1

    :pswitch_1
    iget-byte p1, p0, Lcom/google/android/gms/internal/ads/p32$h;->zziew:B

    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1

    :pswitch_2
    sget-object p1, Lcom/google/android/gms/internal/ads/p32$h;->zzea:Lcom/google/android/gms/internal/ads/l12;

    if-nez p1, :cond_2

    const-class p2, Lcom/google/android/gms/internal/ads/p32$h;

    monitor-enter p2

    :try_start_0
    sget-object p1, Lcom/google/android/gms/internal/ads/p32$h;->zzea:Lcom/google/android/gms/internal/ads/l12;

    if-nez p1, :cond_1

    new-instance p1, Lcom/google/android/gms/internal/ads/rz1$c;

    sget-object p3, Lcom/google/android/gms/internal/ads/p32$h;->zzihs:Lcom/google/android/gms/internal/ads/p32$h;

    invoke-direct {p1, p3}, Lcom/google/android/gms/internal/ads/rz1$c;-><init>(Lcom/google/android/gms/internal/ads/rz1;)V

    sput-object p1, Lcom/google/android/gms/internal/ads/p32$h;->zzea:Lcom/google/android/gms/internal/ads/l12;

    :cond_1
    monitor-exit p2

    goto :goto_0

    :catchall_0
    move-exception p1

    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_2
    :goto_0
    return-object p1

    :pswitch_3
    sget-object p1, Lcom/google/android/gms/internal/ads/p32$h;->zzihs:Lcom/google/android/gms/internal/ads/p32$h;

    return-object p1

    :pswitch_4
    const/16 p1, 0xb

    new-array p1, p1, [Ljava/lang/Object;

    const-string p2, "zzdl"

    aput-object p2, p1, p3

    const-string p2, "zzihk"

    aput-object p2, p1, v0

    const/4 p2, 0x2

    const-string p3, "zziez"

    aput-object p3, p1, p2

    const/4 p2, 0x3

    const-string p3, "zzihl"

    aput-object p3, p1, p2

    const/4 p2, 0x4

    const-string p3, "zzihm"

    aput-object p3, p1, p2

    const/4 p2, 0x5

    const-string p3, "zzihn"

    aput-object p3, p1, p2

    const/4 p2, 0x6

    const-string p3, "zziho"

    aput-object p3, p1, p2

    const/4 p2, 0x7

    const-string p3, "zzihp"

    aput-object p3, p1, p2

    const/16 p2, 0x8

    const-string p3, "zzihq"

    aput-object p3, p1, p2

    const/16 p2, 0x9

    invoke-static {}, Lcom/google/android/gms/internal/ads/p32$h$a;->b()Lcom/google/android/gms/internal/ads/vz1;

    move-result-object p3

    aput-object p3, p1, p2

    const/16 p2, 0xa

    const-string p3, "zzihr"

    aput-object p3, p1, p2

    sget-object p2, Lcom/google/android/gms/internal/ads/p32$h;->zzihs:Lcom/google/android/gms/internal/ads/p32$h;

    const-string p3, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0002\u0003\u0001\u0504\u0000\u0002\u0008\u0001\u0003\u0409\u0002\u0004\u0409\u0003\u0005\u0004\u0004\u0006\u0016\u0007\u0008\u0005\u0008\u000c\u0006\t\u001a"

    invoke-static {p2, p3, p1}, Lcom/google/android/gms/internal/ads/rz1;->a(Lcom/google/android/gms/internal/ads/c12;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    new-instance p1, Lcom/google/android/gms/internal/ads/p32$h$b;

    invoke-direct {p1, v1}, Lcom/google/android/gms/internal/ads/p32$h$b;-><init>(Lcom/google/android/gms/internal/ads/n32;)V

    return-object p1

    :pswitch_6
    new-instance p1, Lcom/google/android/gms/internal/ads/p32$h;

    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/p32$h;-><init>()V

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

.method public final p()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/p32$h;->zziez:Ljava/lang/String;

    return-object v0
.end method

.method public final q()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/p32$h;->zzihr:Lcom/google/android/gms/internal/ads/yz1;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method
