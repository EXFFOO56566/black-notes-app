.class public final Lcom/google/android/gms/internal/ads/p32$c;
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
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/ads/p32$c$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/ads/rz1<",
        "Lcom/google/android/gms/internal/ads/p32$c;",
        "Lcom/google/android/gms/internal/ads/p32$c$a;",
        ">;",
        "Lcom/google/android/gms/internal/ads/e12;"
    }
.end annotation


# static fields
.field private static volatile zzea:Lcom/google/android/gms/internal/ads/l12;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/l12<",
            "Lcom/google/android/gms/internal/ads/p32$c;",
            ">;"
        }
    .end annotation
.end field

.field private static final zzigc:Lcom/google/android/gms/internal/ads/p32$c;


# instance fields
.field private zzdl:I

.field private zzhoa:Lcom/google/android/gms/internal/ads/dy1;

.field private zziew:B

.field private zzigb:Lcom/google/android/gms/internal/ads/dy1;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/ads/p32$c;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/p32$c;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/p32$c;->zzigc:Lcom/google/android/gms/internal/ads/p32$c;

    const-class v1, Lcom/google/android/gms/internal/ads/p32$c;

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/rz1;->a(Ljava/lang/Class;Lcom/google/android/gms/internal/ads/rz1;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/rz1;-><init>()V

    const/4 v0, 0x2

    iput-byte v0, p0, Lcom/google/android/gms/internal/ads/p32$c;->zziew:B

    sget-object v0, Lcom/google/android/gms/internal/ads/dy1;->c:Lcom/google/android/gms/internal/ads/dy1;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/p32$c;->zzigb:Lcom/google/android/gms/internal/ads/dy1;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/p32$c;->zzhoa:Lcom/google/android/gms/internal/ads/dy1;

    return-void
.end method

.method private final a(Lcom/google/android/gms/internal/ads/dy1;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v0, p0, Lcom/google/android/gms/internal/ads/p32$c;->zzdl:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Lcom/google/android/gms/internal/ads/p32$c;->zzdl:I

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/p32$c;->zzhoa:Lcom/google/android/gms/internal/ads/dy1;

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/ads/p32$c;Lcom/google/android/gms/internal/ads/dy1;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/p32$c;->b(Lcom/google/android/gms/internal/ads/dy1;)V

    return-void
.end method

.method private final b(Lcom/google/android/gms/internal/ads/dy1;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v0, p0, Lcom/google/android/gms/internal/ads/p32$c;->zzdl:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/google/android/gms/internal/ads/p32$c;->zzdl:I

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/p32$c;->zzigb:Lcom/google/android/gms/internal/ads/dy1;

    return-void
.end method

.method static synthetic b(Lcom/google/android/gms/internal/ads/p32$c;Lcom/google/android/gms/internal/ads/dy1;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/p32$c;->a(Lcom/google/android/gms/internal/ads/dy1;)V

    return-void
.end method

.method public static p()Lcom/google/android/gms/internal/ads/p32$c$a;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/p32$c;->zzigc:Lcom/google/android/gms/internal/ads/p32$c;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/rz1;->j()Lcom/google/android/gms/internal/ads/rz1$a;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/p32$c$a;

    return-object v0
.end method

.method static synthetic q()Lcom/google/android/gms/internal/ads/p32$c;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/p32$c;->zzigc:Lcom/google/android/gms/internal/ads/p32$c;

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

    iput-byte p1, p0, Lcom/google/android/gms/internal/ads/p32$c;->zziew:B

    return-object v1

    :pswitch_1
    iget-byte p1, p0, Lcom/google/android/gms/internal/ads/p32$c;->zziew:B

    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1

    :pswitch_2
    sget-object p1, Lcom/google/android/gms/internal/ads/p32$c;->zzea:Lcom/google/android/gms/internal/ads/l12;

    if-nez p1, :cond_2

    const-class p2, Lcom/google/android/gms/internal/ads/p32$c;

    monitor-enter p2

    :try_start_0
    sget-object p1, Lcom/google/android/gms/internal/ads/p32$c;->zzea:Lcom/google/android/gms/internal/ads/l12;

    if-nez p1, :cond_1

    new-instance p1, Lcom/google/android/gms/internal/ads/rz1$c;

    sget-object p3, Lcom/google/android/gms/internal/ads/p32$c;->zzigc:Lcom/google/android/gms/internal/ads/p32$c;

    invoke-direct {p1, p3}, Lcom/google/android/gms/internal/ads/rz1$c;-><init>(Lcom/google/android/gms/internal/ads/rz1;)V

    sput-object p1, Lcom/google/android/gms/internal/ads/p32$c;->zzea:Lcom/google/android/gms/internal/ads/l12;

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
    sget-object p1, Lcom/google/android/gms/internal/ads/p32$c;->zzigc:Lcom/google/android/gms/internal/ads/p32$c;

    return-object p1

    :pswitch_4
    const/4 p1, 0x3

    new-array p1, p1, [Ljava/lang/Object;

    const-string p2, "zzdl"

    aput-object p2, p1, p3

    const-string p2, "zzigb"

    aput-object p2, p1, v0

    const/4 p2, 0x2

    const-string p3, "zzhoa"

    aput-object p3, p1, p2

    sget-object p2, Lcom/google/android/gms/internal/ads/p32$c;->zzigc:Lcom/google/android/gms/internal/ads/p32$c;

    const-string p3, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001\u050a\u0000\u0002\n\u0001"

    invoke-static {p2, p3, p1}, Lcom/google/android/gms/internal/ads/rz1;->a(Lcom/google/android/gms/internal/ads/c12;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    new-instance p1, Lcom/google/android/gms/internal/ads/p32$c$a;

    invoke-direct {p1, v1}, Lcom/google/android/gms/internal/ads/p32$c$a;-><init>(Lcom/google/android/gms/internal/ads/n32;)V

    return-object p1

    :pswitch_6
    new-instance p1, Lcom/google/android/gms/internal/ads/p32$c;

    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/p32$c;-><init>()V

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
